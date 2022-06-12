package Symbol_Tables;

import java.util.ArrayList;
import java.util.List;

public class Pages_Table {
    List <String> pages = new ArrayList<>();

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    public void print(){
        System.out.println("the pages Table");
        for (int i = 0; i < pages.size(); i++) {
            System.out.println(pages.get(i));
        }

    }
}
