package ast;

/**
 * Represents a fix-point in the AST.
 * Example: fix fun x -> x + 1
 */
public class Fun extends Term {
    public final String var;
    public final Term term;

    public Fun(String var, Term term) {
        this.term = term;
        this.var = var;
    }

    public Term getTerm() {
        return term;
    }

    public String getVar() {
        return var;
    }

}
