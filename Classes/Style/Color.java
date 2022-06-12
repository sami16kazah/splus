package Classes.Style;

import Classes.Basic.Var;

public class Color {
    String Color;
    Var var;

    public String getColor() {
        return Color;
    }

    public void setColor(String textColor) {
        this.Color = textColor;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Color = " +
                ", var=" + var ;
    }
}
