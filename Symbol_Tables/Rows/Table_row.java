package Symbol_Tables.Rows;

import java.util.ArrayList;
import java.util.List;

public class Table_row {
    String tableName;
    List <String> table_columns = new ArrayList<>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getTable_columns() {
        return table_columns;
    }

    public void setTable_columns(List<String> table_columns) {
        this.table_columns = table_columns;
    }
}
