package Classes.Basic;

public class Elements {
    Var var;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public java.lang.String toString() {
        return "\t ," +
                var ;
    }
}
