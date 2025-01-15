package ast;

/**
 * Represents a let-binding in the AST.
 * Example: let x = 5 in x + 3
 */
public class Let extends Term {
    private final String variable;
    private final Term boundValue;
    private final Term body;

    public Let(String variable, Term boundValue, Term body) {
        this.variable = variable;
        this.boundValue = boundValue;
        this.body = body;
    }

    public String getVariable() {
        return variable;
    }

    public Term getBoundValue() {
        return boundValue;
    }

    public Term getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Let(" + variable + ", " + boundValue + ", " + body + ")";
    }
}

