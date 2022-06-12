package Symbol_Tables.Rows;

public class Page_row {
    String page_name;
    String form_Or_table;
    String table_name;
    String View_type;
    String View_by;
    String Role;

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public String getForm_Or_table() {
        return form_Or_table;
    }

    public void setForm_Or_table(String form_Or_table) {
        this.form_Or_table = form_Or_table;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getView_type() {
        return View_type;
    }

    public void setView_type(String view_type) {
        View_type = view_type;
    }

    public String getView_by() {
        return View_by;
    }

    public void setView_by(String view_by) {
        View_by = view_by;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
