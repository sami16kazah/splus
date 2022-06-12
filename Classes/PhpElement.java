package Classes;


import Classes.elements.*;

public class PhpElement {
  Auth auth;
  Controllers controllers;
  Footer footer;
  Inject inject;
  Login login;
  Logo logo;
  Name name;
  Nav nav;
  Page page;
  SignUp signUp;
  Style style;

  public Auth getAuth() {
    return auth;
  }

  public void setAuth(Auth auth) {
    this.auth = auth;
  }

  public Controllers getControllers() {
    return controllers;
  }

  public void setControllers(Controllers controllers) {
    this.controllers = controllers;
  }

  public Footer getFooter() {
    return footer;
  }

  public void setFooter(Footer footer) {
    this.footer = footer;
  }

  public Inject getInject() {
    return inject;
  }

  public void setInject(Inject inject) {
    this.inject = inject;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public Logo getLogo() {
    return logo;
  }

  public void setLogo(Logo logo) {
    this.logo = logo;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Nav getNav() {
    return nav;
  }

  public void setNav(Nav nav) {
    this.nav = nav;
  }

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public SignUp getSignUp() {
    return signUp;
  }

  public void setSignUp(SignUp signUp) {
    this.signUp = signUp;
  }

  public Style getStyle() {
    return style;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  @Override
  public String toString() {
    if(auth != null)
      return  " "+ auth;
      if(controllers != null)
        return  " "+ controllers;
        if(footer != null)
          return  " "+ footer;
          if(inject != null)
            return  " "+ inject;
            if(login != null)
              return  " "+ login;
              if(logo != null)
                return  " "+ logo;
                if(name != null)
                  return  " "+ name;
                  if(nav != null)
                    return  " "+ nav;
                    if(page != null)
                      return  " "+ page;
                      if(signUp != null)
                        return  " "+ signUp;
    return  " "+ style;



  }
}
