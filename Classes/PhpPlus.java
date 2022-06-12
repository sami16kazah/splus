package Classes;

import java.util.ArrayList;
import java.util.List;

public class PhpPlus {
List<PhpElement> phpElements = new ArrayList<>();

    public List<PhpElement> getPhpElements() {
        return phpElements;
    }

    public void setPhpElements(List<PhpElement> phpElements) {
        this.phpElements = phpElements;
    }

    @Override
    public String toString() {
        return "" +
                 phpElements
                ;
    }
}
