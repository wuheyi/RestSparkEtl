// Generated from /Users/dxy_why/Documents/workspace/RestSparkEtl/src/src/main/java/hz/why/restsparketl/dsl/resources/WorldCount.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by the {@code create}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCreate(WorldCountParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code create}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCreate(WorldCountParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code show}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShow(WorldCountParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code show}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShow(WorldCountParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code count}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCount(WorldCountParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code count}
	 * labeled alternative in {@link WorldCountParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCount(WorldCountParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link WorldCountParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(WorldCountParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link WorldCountParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(WorldCountParser.PathContext ctx);
}