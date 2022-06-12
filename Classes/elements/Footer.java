package Classes.elements;


import Classes.Basic.Strings;

public class Footer {
    String footer;
    Strings string;

    public String getfooter() {
        return footer;
    }

    public void setfooter(String name) {
        this.footer = name;
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
                "" + footer +
                "\t the logo url is =  " + string ;
    }
}
