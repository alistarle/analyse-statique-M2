package ast;

public enum Unop {
    SUB, NOT;

    @Override
    public String toString() {
        switch(this) {
            case SUB: return "-";
            case NOT: return "!";
        }
        return null;
    }
}
