package Classes.Style;

import Classes.Basic.Var;

import java.util.ArrayList;
import java.util.List;

public class PageStyle {
    List<StyleAttributes> styleAttributes = new ArrayList<>();
    Var var;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public List<StyleAttributes> getStyleAttributes() {
        return styleAttributes;
    }

    public void setStyleAttributes(List<StyleAttributes> styleAttributes) {
        this.styleAttributes = styleAttributes;
    }

    @Override
    public String toString() {
        return "PageStyle{" +
                "styleAttributes=" + styleAttributes +
                var + '}';
    }
}
