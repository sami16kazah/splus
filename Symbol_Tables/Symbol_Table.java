package Symbol_Tables;

import Symbol_Tables.Rows.*;

import java.util.ArrayList;
import java.util.List;

public class Symbol_Table {

    List<NormalRow> normalRows =new ArrayList<>();
    List<Inject_row> inject_rows =new ArrayList<>();
    List<Style_row> style_rows =new ArrayList<>();
    List<Controller_row> controller_rows =new ArrayList<>();
    List<Page_row> page_rows =new ArrayList<>();
    List<Table_row> table_rows =new ArrayList<>();

    public List<NormalRow> getRow() {
        return normalRows;
    }

    public void setRow(List<NormalRow> row) {
        this.normalRows = row;
    }

    public List<Inject_row> getInject_rows() {
        return inject_rows;
    }

    public void setInject_rows(List<Inject_row> inject_rows) {
        this.inject_rows = inject_rows;
    }

    public List<Style_row> getStyle_rows() {
        return style_rows;
    }

    public void setStyle_rows(List<Style_row> style_rows) {
        this.style_rows = style_rows;
    }

    public List<Controller_row> getController_rows() {
        return controller_rows;
    }

    public void setController_rows(List<Controller_row> controller_rows) {
        this.controller_rows = controller_rows;
    }

    public List<Page_row> getPage_rows() {
        return page_rows;
    }

    public void setPage_rows(List<Page_row> page_rows) {
        this.page_rows = page_rows;
    }

    public List<Table_row> getTable_rows() {
        return table_rows;
    }

    public void setTable_rows(List<Table_row> table_rows) {
        this.table_rows = table_rows;
    }

    public void print(){
        System.out.println("******************************  normal rows ****************************** ");
        for (int i = 0; i < normalRows.size(); i++) {

            if(normalRows.get(i)!=null)
            {System.out.print(normalRows.get(i).getFunction_name() + "\t\t\t\t");
                System.out.println(normalRows.get(i).getFunction_value());
            }
        }
        System.out.println("******************************  inject rows ****************************** ");
        for (int j = 0; j < inject_rows.size(); j++) {

            if(inject_rows.get(j)!=null)
            {
                System.out.print(inject_rows.get(j).getRole() + "\t\t\t");
                System.out.print(inject_rows.get(j).getEmail() + "\t\t\t");
                System.out.println(inject_rows.get(j).getPassword());

            }
        }
        System.out.println("****************************** page rows ******************************   ");
        for (int x = 0; x < page_rows.size(); x++) {
            if(page_rows.get(x)!=null)
            {
                System.out.print(page_rows.get(x).getPage_name() +"\t\t");
                System.out.print(page_rows.get(x).getForm_Or_table()+"\t\t");
                System.out.print(page_rows.get(x).getTable_name()+"\t\t");
                System.out.print(page_rows.get(x).getView_type()+"\t\t");
                System.out.print(page_rows.get(x).getView_by()+"\t\t");
                System.out.print(page_rows.get(x).getRole());
                System.out.println(" ");
            }
        }

        System.out.println("******************************  controller rows ****************************** ");

        for (int y = 0; y < controller_rows.size(); y++) {

            if(controller_rows.get(y)!=null)
            { System.out.print(controller_rows.get(y).getStart() + "\t\t\t");
                System.out.println(controller_rows.get(y).getDestination());}
        }
        System.out.println("******************************  table rows ****************************** ");
        for (int z = 0; z < table_rows.size(); z++) {
            if(table_rows.get(z)!=null)
            {
                System.out.print(table_rows.get(z).getTableName());
                for (int i = 0; i < table_rows.get(z).getTable_columns().size() ; i++) {
                    if(table_rows.get(z).getTable_columns().get(i)!= null)
                    {
                    System.out.println(table_rows.get(z).getTable_columns().get(i));
                    System.out.print("\t\t");
                    }
                }
            System.out.println(" ");
            }
        }

        System.out.println("****************************** style rows ******************************   ");

        for (int c = 0; c < style_rows.size(); c++) {

            if(style_rows.get(c)!=null) {
                System.out.print(style_rows.get(c).getPage_name()+"\t\t\t");
                System.out.print(style_rows.get(c).getColor()+"\t\t\t");
                System.out.print(style_rows.get(c).getText_color()+"\t\t\t");
                System.out.print(style_rows.get(c).getInput_color()+"\t\t\t");
                System.out.println(style_rows.get(c).getAlign());
            }
        }
    }
}
