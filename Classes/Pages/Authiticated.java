package Classes.Pages;

public class Authiticated {
    String only;
    String auth;

    public String getOnly() {
        return only;
    }

    public void setOnly(String only) {
        this.only = only;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return " " +
                 only + auth
                ;
    }
}
