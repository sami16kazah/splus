package Classes.Style;

import java.util.ArrayList;
import java.util.List;

public class NavStyle {
    List<StyleAttributes> styleAttributes = new ArrayList<>();

    public List<StyleAttributes> getStyleAttributes() {
        return styleAttributes;
    }

    public void setStyleAttributes(List<StyleAttributes> styleAttributes) {
        this.styleAttributes = styleAttributes;
    }

    @Override
    public String toString() {
        return "NavStyle{" +
                "styleAttributes=" + styleAttributes +
                '}';
    }
}
