package Classes.Style;

import Classes.Basic.Var;

public class TextColor {
    String textColor;
    Var var;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "TextColor = " +
                ", var=" + var ;
    }
}
