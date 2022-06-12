package Classes.Controller;

import Classes.Basic.Attributes;
import Classes.Basic.FormAttributes;
import Classes.Basic.Table_Name;

import java.util.ArrayList;
import java.util.List;

public class FormController {
    Table_Name table_name;
    FormAttributes formAttributes;

    public FormAttributes getFormAttributes() {
        return formAttributes;
    }

    public void setFormAttributes(FormAttributes formAttributes) {
        this.formAttributes = formAttributes;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    @Override
    public java.lang.String toString() {
        return "\nFormController{" +
                table_name + formAttributes ;
    }



}
