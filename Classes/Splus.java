package Classes;

import java.util.ArrayList;
import java.util.List;

public class Splus {
    List <PhpPlus> phpPluses = new ArrayList<>();

    public List<PhpPlus> getPhpPluses() {
        return phpPluses;
    }

    public void setPhpPluses(List<PhpPlus> phpPluses) {
        this.phpPluses = phpPluses;
    }

    @Override
    public String toString() {
        return "Splus{" + phpPluses +
                '}';
    }
}
