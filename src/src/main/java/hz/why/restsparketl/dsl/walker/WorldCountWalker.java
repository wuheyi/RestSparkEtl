package hz.why.restsparketl.dsl.walker;

import hz.why.restsparketl.dsl.listener.UserDefinedWorldCountListener;
import hz.why.restsparketl.dsl.parser.WorldCountLexer;
import hz.why.restsparketl.dsl.parser.WorldCountParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by wuheyi on 2018/5/23.
 */
public class WorldCountWalker {
    public static void walk(String input) {

        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(input);

        // 用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        WorldCountLexer lexer = new WorldCountLexer(in);

        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        WorldCountParser parser = new WorldCountParser(tokenStream);

        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new UserDefinedWorldCountListener(), tree);

    }
}
