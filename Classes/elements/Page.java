package Classes.elements;

import Classes.Pages.PageAttributes;

public class Page {
    PageAttributes pageAttributes;

    public PageAttributes getPageAttributes() {
        return pageAttributes;
    }

    public void setPageAttributes(PageAttributes pageAttributes) {
        this.pageAttributes = pageAttributes;
    }

    @Override
    public String toString() {
        return "\n" +
                pageAttributes ;
    }
}
