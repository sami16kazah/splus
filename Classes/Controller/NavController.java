package Classes.Controller;

import Classes.Basic.Array;

public class NavController {
    String Nav;
    Array array;

    public String getNav() {
        return Nav;
    }

    public void setNav(String footer) {
        Nav = footer;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "\nNavController{" +
                Nav  + array ;
    }
}
