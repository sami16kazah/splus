package Classes.Pages;

import Classes.Basic.Column_Name;

public class ViewAs {
    String view;
    Column_Name column_name;

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public Column_Name getColumn_name() {
        return column_name;
    }

    public void setColumn_name(Column_Name column_name) {
        this.column_name = column_name;
    }

    @Override
    public String toString() {
        return
                "\nview='" + view +  column_name ;
    }
}
