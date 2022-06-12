package Classes.Controller;

import Classes.Basic.Destination;
import Classes.Basic.PageName;

public class PageController {
    PageName pageName;
    Destination destination;

    public PageName getPageName() {
        return pageName;
    }

    public void setPageName(PageName pageName) {
        this.pageName = pageName;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "\nPageController{" +
               pageName +
               destination;
    }
}
