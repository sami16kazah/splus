package Classes.Basic;

public class AttNAme {
    Var var;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public java.lang.String toString() {
        return "\n AttName = " +
                var ;
    }
}
