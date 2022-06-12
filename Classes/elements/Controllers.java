package Classes.elements;

import Classes.Controller.*;

public class Controllers {
    String Controllers;
    LoginController loginController;
    SignUpController signUpController;
    NavController navController;
    FooterController footerController;
    PageController pageController;
    FormController formController;

    public String getControllers() {
        return Controllers;
    }

    public void setControllers(String controllers) {
        Controllers = controllers;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public SignUpController getSignUpController() {
        return signUpController;
    }

    public void setSignUpController(SignUpController signUpController) {
        this.signUpController = signUpController;
    }

    public NavController getNavController() {
        return navController;
    }

    public void setNavController(NavController navController) {
        this.navController = navController;
    }

    public FooterController getFooterController() {
        return footerController;
    }

    public void setFooterController(FooterController footerController) {
        this.footerController = footerController;
    }

    public PageController getPageController() {
        return pageController;
    }

    public void setPageController(PageController pageController) {
        this.pageController = pageController;
    }

    public FormController getFormController() {
        return formController;
    }

    public void setFormController(FormController formController) {
        this.formController = formController;
    }

    @Override
    public String toString() {
        if(loginController!=null)
            return "\nControllers = " +
                    " '" + Controllers +
                     loginController ;
            if(signUpController!=null)
                return "\nControllers = " +
                        " '" + Controllers +
                        signUpController ;
                if(navController!=null)
                    return "\nControllers = " +
                            " '" + Controllers +
                            navController ;
                    if(footerController!=null)
                        return "\nControllers = " +
                                " '" + Controllers +
                                footerController ;
            if(pageController!=null)
                return "\nControllers = " +
                        " '" + Controllers +
                        pageController ;
        return "\nControllers = " +
                " '" + Controllers +
                formController ;



    }
}
