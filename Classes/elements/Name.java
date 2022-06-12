package Classes.elements;

import Classes.Basic.Strings;

public class Name {
    java.lang.String name;
    Strings string;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
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
                "" + name +
                "\t the name is =  " + string ;
    }
}
