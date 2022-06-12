package Symbol_Tables;

import java.util.ArrayList;
import java.util.List;

public class Basic_Table {
    List<String> basic = new ArrayList<>();

    public List<String> getBasic() {
        return basic;
    }

    public void setBasic(List<String> basic) {
        this.basic = basic;
    }

    public void print(){
        System.out.println("the basic Table");
        for (int i = 0; i < basic.size(); i++) {
            System.out.println(basic.get(i));
        }

    }
}
