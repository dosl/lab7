import java.util.ArrayList;
import java.util.HashMap;

public class UsableItem {
    private String name;
    private int buyValue;
    private int sellValue;
    private int increaseHp;
    private int increaseDmg;
    private int increaseDef;
    private int quantity;
    private GameCharacter gameCharacter;

    public UsableItem(String name, int buyValue, int sellValue, int increaseHp, int increaseDmg, int increaseDef, int quantity) {

        this.name = name;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.increaseHp = increaseHp;
        this.increaseDmg = increaseDmg;
        this.increaseDef = increaseDef;
        this.quantity = quantity;
    }

    public int getBuyValue() {
        return buyValue;
    }

    public int getSellValue() {
        return sellValue;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

//    public void receiveItems(UsableItem usableItem, int quantity) {
//        this.quantity += quantity;
//
//    }

//    public void buy(UsableItem usableItem, int quantity) {
//        if (gameCharacter.getMoney() > usableItem.buyValue * quantity) {
//            gameCharacter.setMoney(gameCharacter.getMoney() - usableItem.buyValue * quantity);
//            receiveItems(usableItem, quantity);
//        } else {
//            System.err.println("not enough money");
//        }
//
//    }

    //    public UsableItem(String name) {
//        this.name = name;
//        this.buyValue = buyValue;
//        this.sellValue = sellValue;
//    }
    public void initialize() {
//        setPriceBuy();
//        setPriceSell();
    }

    String[][] usableItemList = new String[10][2];


    //    HashMap<String, Integer> buyPotionMap = new HashMap<>();
//    HashMap<String, Integer> sellPotionMap = new HashMap<>();
    ArrayList<String> potionList = new ArrayList<>();


//    public ArrayList<String> getPotionList() {
//        potionList.add("potion");
//        potionList.add("super potion");
//        potionList.add("hyper potion");
//        potionList.add("max potion");
//        potionList.add("full restore");
//        return potionList;
//    }
//    private void setPriceBuy(){
//        buyPotionMap.put("potion",300);
//        buyPotionMap.put("super potion",700);
//    }
//    private void setPriceSell(){
//        sellPotionMap.put("potion",150);
//        sellPotionMap.put("potion",350);
//    }

}
