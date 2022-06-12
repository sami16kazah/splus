package Classes.Controller;

import Classes.Basic.Destination;

public class LoginController {
    String Login ;
    Destination destination;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "\nLoginController{" +
                 Login + destination;
    }
}
