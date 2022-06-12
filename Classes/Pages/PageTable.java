package Classes.Pages;

import Classes.Basic.Table_Name;

public class PageTable {
    String table;
    Table_Name table_name;
    ViewAs viewAs;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    public ViewAs getViewAs() {
        return viewAs;
    }

    public void setViewAs(ViewAs viewAs) {
        this.viewAs = viewAs;
    }

    @Override
    public String toString() {
        return "\n" +
                table  + table_name + viewAs ;
    }
}
