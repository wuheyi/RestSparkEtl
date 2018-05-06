package hz.why.restsparketl.core

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


/**
  * Created by wuheyi on 2018/5/6.
  */
object PlatformManager {
  /**
    * spring boot调用spark的测试例子
    * @return
    */
  def start_simple_application(): Long = {
    val conf = new SparkConf()
    conf.setMaster("local")
    val spark = SparkSession
      .builder
      .config(conf)
      .appName("simple application")
      .getOrCreate()
    spark.sparkContext.setLogLevel("WARN")
    val rdd = spark.sparkContext.parallelize(List("hangzhou", "is a beautiful city"))
    rdd.count()
  }

}
