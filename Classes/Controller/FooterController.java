package Classes.Controller;

import Classes.Basic.Array;

public class FooterController {
    String Footer;
    Array array;

    public String getFooter() {
        return Footer;
    }

    public void setFooter(String footer) {
        Footer = footer;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "\nFooterController{" +
                 Footer  + array ;
    }
}
