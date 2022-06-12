package Classes.Basic;

import java.util.ArrayList;
import java.util.List;

public class Array {
    List<Elements> elements = new ArrayList<>();

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    @Override
    public java.lang.String toString() {
        return "Array [" + elements +
                " ]";
    }
}
