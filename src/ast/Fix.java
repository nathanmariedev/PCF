package ast;

/**
 * Represents a fix-point in the AST.
 * Example: fix fun x -> x + 1
 */
public class Fix extends Term {
    public final String var;
    public final Term term;

    public Fix(Term term, String var) {
        this.var = var;
        this.term = term;
    }

    public Term getTerm() {
        return term;
    }

    public String getVar() {
        return var;
    }

}
