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
    public void enterCreate(WorldCountParser.CreateContext ctx) {
        super.enterCreate(ctx);
    }

    @Override
    public void exitCreate(WorldCountParser.CreateContext ctx) {
        System.out.println(ctx.TABLENAME());
        System.out.println(ctx.FILETYPE());
        System.out.println(ctx.path().BACKQUOTED_IDENTIFIER());

        super.exitCreate(ctx);
    }

    @Override
    public void enterShow(WorldCountParser.ShowContext ctx) {
        super.enterShow(ctx);
    }

    @Override
    public void exitShow(WorldCountParser.ShowContext ctx) {
        super.exitShow(ctx);
    }

    @Override
    public void enterCount(WorldCountParser.CountContext ctx) {
        super.enterCount(ctx);
    }

    @Override
    public void exitCount(WorldCountParser.CountContext ctx) {
        super.exitCount(ctx);
    }

    @Override
    public void enterPath(WorldCountParser.PathContext ctx) {
        super.enterPath(ctx);
    }

    @Override
    public void exitPath(WorldCountParser.PathContext ctx) {
        super.exitPath(ctx);
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
