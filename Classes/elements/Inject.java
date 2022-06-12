package Classes.elements;

import Classes.Basic.Email;
import Classes.Basic.Password;
import Classes.Basic.Role;

public class Inject {
    String InjectUser;
    Role role;
    Email email;
    Password password;

    public String getInjectUser() {
        return InjectUser;
    }

    public void setInjectUser(String injectUser) {
        InjectUser = injectUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return
                "\nInjectUser='" + InjectUser + '\'' +
                " role=" + role +
                "\t email=" + email +
                "\t password=" + password ;
    }
}
