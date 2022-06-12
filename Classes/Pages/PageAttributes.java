package Classes.Pages;

import Classes.Basic.Name_page;

public class PageAttributes {
Name_page name_page;
PageForm pageForm;
PageTable pageTable;
Authiticated authiticated;

    public Name_page getName_page() {
        return name_page;
    }

    public void setName_page(Name_page name_page) {
        this.name_page = name_page;
    }

    public PageForm getPageForm() {
        return pageForm;
    }

    public void setPageForm(PageForm pageForm) {
        this.pageForm = pageForm;
    }

    public PageTable getPageTable() {
        return pageTable;
    }

    public void setPageTable(PageTable pageTable) {
        this.pageTable = pageTable;
    }

    public Authiticated getAuthiticated() {
        return authiticated;
    }

    public void setAuthiticated(Authiticated authiticated) {
        this.authiticated = authiticated;
    }

    @Override
    public String toString() {
        if(pageForm!=null )
        {if(authiticated!=null )

            return " " + name_page +
                     pageForm +
                      authiticated ;

            return "{" +
                     name_page +
                     pageForm ;
        }

        if(pageTable != null)

        {if(authiticated!=null )
            return " " + name_page +
                    pageTable +
                    authiticated ;

            return " " + name_page +
                    pageTable
                     ;
        }

        if(authiticated!=null)
            return " " + name_page +
                    authiticated ;

        return " " + name_page ;


    }
}
