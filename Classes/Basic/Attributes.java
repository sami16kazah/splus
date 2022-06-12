package Classes.Basic;

public class Attributes {
    AttNAme attNAme;
    AttType attType;

    public AttNAme getAttNAme() {
        return attNAme;
    }

    public void setAttNAme(AttNAme attNAme) {
        this.attNAme = attNAme;
    }

    public AttType getAttType() {
        return attType;
    }

    public void setAttType(AttType attType) {
        this.attType = attType;
    }

    @Override
    public java.lang.String toString() {
        return "" +
                 attNAme +
                "\t" + attType ;
    }
}
