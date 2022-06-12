package Classes.Style;

import Classes.Basic.Var;

public class InputColor {

    String InputColor;
    Var var;

    public String getInputColor() {
        return InputColor;
    }

    public void setInputColor(String textColor) {
        this.InputColor = textColor;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "InputColor = " +
                ", var=" + var ;
    }
}
