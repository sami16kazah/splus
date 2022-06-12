package Classes.Basic;

import java.util.ArrayList;
import java.util.List;

public class FormAttributes {
    List<Attributes> attributes = new ArrayList<>();
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public java.lang.String toString() {
        return "\n" +
                 attributes ;
    }
}
