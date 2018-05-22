// Generated from /Users/wuheyi/IdeaProjects/RestSparkEtl/src/src/main/java/hz/why/restsparketl/dsl/resources/WorldCount.g4 by ANTLR 4.7
package hz.why.restsparketl.dsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WorldCountParser}.
 */
public interface WorldCountListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WorldCountParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(WorldCountParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorldCountParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(WorldCountParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorldCountParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(WorldCountParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorldCountParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(WorldCountParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WorldCountParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WorldCountParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorldCountParser#filedir}.
	 * @param ctx the parse tree
	 */
	void enterFiledir(WorldCountParser.FiledirContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorldCountParser#filedir}.
	 * @param ctx the parse tree
	 */
	void exitFiledir(WorldCountParser.FiledirContext ctx);
}