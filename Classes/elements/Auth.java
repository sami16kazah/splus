package Classes.elements;

public class Auth {
    String Auth;

    public String getAuth() {
        return Auth;
    }

    public void setAuth(String auth) {
        Auth = auth;
    }

    @Override
    public String toString() {
        return "" +
                "" + Auth + '\n'
                ;
    }
}
