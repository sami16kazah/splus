package Classes.Pages;

import Classes.Basic.Table_Name;

public class PageForm {
    String Form;
    Table_Name table_name;

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    @Override
    public String toString() {
        return "\n" +  Form  +
               table_name ;
    }
}
