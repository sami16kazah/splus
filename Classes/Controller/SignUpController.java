package Classes.Controller;

import Classes.Basic.Destination;

public class SignUpController {
    String SignUp;
    Destination destination;

    public String getSignUp() {
        return SignUp;
    }

    public void setSignUp(String signUp) {
        SignUp = signUp;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "SignUpController{"
                 + SignUp  + destination ;
    }
}
