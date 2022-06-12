package Classes.Basic;

public class PageName {
    String Pname;

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    @Override
    public java.lang.String toString() {
        return
                "\n PageName=" + Pname
                ;
    }
}
