import java.util.ArrayList;
import java.util.HashMap;

public class Item {
    ArrayList<Integer> itemList = new ArrayList<>();
    HashMap<String,ArrayList> map = new HashMap<>();

    public void setItemList(){
        map.put("potion", itemList);
        //map.put("potion",itemList.set(0,250));
    }
}
