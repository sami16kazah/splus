package Classes.Style;

public class StyleAttributes {
    TextColor textColor;
    Color color;
    Align align;
    InputColor inputColor;

    public TextColor getTextColor() {
        return textColor;
    }

    public void setTextColor(TextColor textColor) {
        this.textColor = textColor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public InputColor getInputColor() {
        return inputColor;
    }

    public void setInputColor(InputColor inputColor) {
        this.inputColor = inputColor;
    }

    @Override
    public String toString() {
        if(textColor!=null)
            return "\t" +
                    "\t" + textColor ;
            if(color!=null)
                return "\t" +
                        "\t" + color ;
                if(align!=null)
                    return "\t" +
                            "\t" + align ;

        return "\t" +
                "\t" + inputColor ;

    }
}
