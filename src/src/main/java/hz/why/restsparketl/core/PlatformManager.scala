package hz.why.restsparketl.core

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


/**
  * Created by wuheyi on 2018/5/6.
  */
object PlatformManager {
  def start_simple_application(): Long = {
    val conf = new SparkConf().setAppName("mySpark")
    //setMaster("local") 本机的spark就用local，远端的就写ip
    //如果是打成jar包运行则需要去掉 setMaster("local")因为在参数中会指定。
    conf.setMaster("local")

    val spark = SparkSession
      .builder
      .config(conf)
      .appName("StructuredKafkaWordCount")
      .getOrCreate()
    spark.sparkContext.setLogLevel("WARN")
    val rdd = spark.sparkContext.parallelize(List("shenzhen", "is a beautiful city"))
    rdd.count()
  }

}
