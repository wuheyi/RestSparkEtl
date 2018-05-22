package hz.why.restsparketl.dsl.listener;

import hz.why.restsparketl.dsl.parser.WorldCountBaseListener;
import hz.why.restsparketl.dsl.parser.WorldCountParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by wuheyi on 2018/5/23.
 */
public class UserDefinedWorldCountListener extends WorldCountBaseListener {
    @Override
    public void enterProg(WorldCountParser.ProgContext ctx) {
        super.enterProg(ctx);
    }

    @Override
    public void exitProg(WorldCountParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    @Override
    public void enterStat(WorldCountParser.StatContext ctx) {
        super.enterStat(ctx);
    }

    @Override
    public void exitStat(WorldCountParser.StatContext ctx) {
        super.exitStat(ctx);
    }

    @Override
    public void enterExpr(WorldCountParser.ExprContext ctx) {
        super.enterExpr(ctx);
    }

    @Override
    public void exitExpr(WorldCountParser.ExprContext ctx) {
        super.exitExpr(ctx);
    }

    @Override
    public void enterFiledir(WorldCountParser.FiledirContext ctx) {
        super.enterFiledir(ctx);
    }

    @Override
    public void exitFiledir(WorldCountParser.FiledirContext ctx) {
        super.exitFiledir(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
