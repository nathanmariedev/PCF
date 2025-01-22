package ast;

/**
 * Represents a variable in the AST.
 */
public class Var extends Term {
    public final String name;

    public Var(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Var(" + name + ")";
    }
}
