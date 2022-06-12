package Classes.elements;

import Classes.Basic.Strings;

public class Logo {
    String logo;
    Strings string;

    public String getlogo() {
        return logo;
    }

    public void setlogo(String name) {
        this.logo = name;
    }

    public Strings getString() {
        return string;
    }

    public void setString(Strings string) {
        this.string = string;
    }

    @Override
    public java.lang.String toString() {
        return "" +
                "" + logo +
                "\t the logo url is =  " + string ;
    }
}
