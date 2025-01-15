package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends PCFBaseVisitor<AST> {

    @Override
    public AST visitLit(PCFParser.LitContext ctx) {
        return new Lit(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitBinOp1(PCFParser.BinOp1Context ctx) {
        OP op = OP.parseOP(ctx.OP1().getText());
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new BinOp(op, terms.get(0), terms.get(1));
    }

    @Override
    public AST visitBinOp2(PCFParser.BinOp2Context ctx) {
        OP op = OP.parseOP(ctx.OP2().getText());
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new BinOp(op, terms.get(0), terms.get(1));
    }


    @Override
    public AST visitCond(PCFParser.CondContext ctx) {
        List<PCFParser.TermContext> ANTLRTerms = ctx.term();
        List<Term> terms = new ArrayList<>();
        for (PCFParser.TermContext ANTLRTerm : ANTLRTerms)
            terms.add((Term) visit(ANTLRTerm));
        return new Cond(terms.get(0), terms.get(1), terms.get(2));
    }

    @Override
    public AST visitParens(PCFParser.ParensContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public AST visitVar(PCFParser.VarContext ctx) {
        return new Var(ctx.getText());
    }

    /**
     * Handle let-bindings (e.g., let x = 5 in x + 3)
     */
    @Override
    public AST visitLet(PCFParser.LetContext ctx) {
        String varName = ctx.VAR().getText();
        Term boundValue = (Term) visit(ctx.term(0));
        Term body = (Term) visit(ctx.term(1));
        return new Let(varName, boundValue, body);
    }

}