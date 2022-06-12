package Symbol_Tables;

import java.util.ArrayList;
import java.util.List;

public class Db_Table {
    List<String> Db = new ArrayList<>();

    public List<String> getDb() {
        return Db;
    }

    public void setDb(List<String> db) {
        Db = db;
    }

    public void print(){
        System.out.println("the Db Table");
        for (int i = 0; i < Db.size(); i++) {
            System.out.println(Db.get(i));
        }

    }
}
