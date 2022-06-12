package Classes.Basic;

public class Table_Name {
    Var var;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public java.lang.String toString() {
        return "\n Table_name = " +
                var ;
    }
}
