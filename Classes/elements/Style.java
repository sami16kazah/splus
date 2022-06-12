package Classes.elements;

import Classes.Style.*;

public class Style {
    LoginStyle loginStyle;
    SignUpStyle signUpStyle;
    NavStyle navStyle;
    FooterStyle footerStyle;
    PageStyle pageStyle;

    public LoginStyle getLoginStyle() {
        return loginStyle;
    }

    public void setLoginStyle(LoginStyle loginStyle) {
        this.loginStyle = loginStyle;
    }

    public SignUpStyle getSignUpStyle() {
        return signUpStyle;
    }

    public void setSignUpStyle(SignUpStyle signUpStyle) {
        this.signUpStyle = signUpStyle;
    }

    public NavStyle getNavStyle() {
        return navStyle;
    }

    public void setNavStyle(NavStyle navStyle) {
        this.navStyle = navStyle;
    }

    public FooterStyle getFooterStyle() {
        return footerStyle;
    }

    public void setFooterStyle(FooterStyle footerStyle) {
        this.footerStyle = footerStyle;
    }

    public PageStyle getPageStyle() {
        return pageStyle;
    }

    public void setPageStyle(PageStyle pageStyle) {
        this.pageStyle = pageStyle;
    }

    @Override
    public String toString() {
        if(loginStyle!=null)
            return "\nStyle{" +
                    "loginStyle=" + loginStyle +
                    '}';
            if(signUpStyle!=null)
                return "\nStyle{" +
                        "signUpStyle=" + signUpStyle +
                        '}';
                if(navStyle!=null)
        return "\nStyle{" +
                "navStyle=" + navStyle +
                '}';
                if(footerStyle!=null)
                    return "\nStyle{" +
                            "footerStyle=" + footerStyle +
                            '}';
        return "\nStyle{" +
                "pageStyle=" + pageStyle +
                '}';


    }
}
