public class GameCharacterMain {
    public static void main(String[] args) {
        UsableItem potion = new UsableItem("potion", 300, 150, 20, 0, 0, 0);
        UsableItem superPotion = new UsableItem("super potion", 700, 350, 50, 0, 0, 0);
        GameCharacter mudkip = new GameCharacter("Mudkip", 50, 70, 50, 15, 0, 1000);
        mudkip.buy(superPotion, 3);
        System.out.println("quantity super potion: " + superPotion.getQuantity());
        System.out.println("quantity potion: " + potion.getQuantity());
        mudkip.buy(potion, 1);
        System.out.println("quantity potion " + potion.getQuantity());
        System.out.println("mudkip's money: " + mudkip.getMoney());
        mudkip.buy(potion, 1);
        System.out.println("quantity potion " + potion.getQuantity());
        System.out.println("mudkip's money: " + mudkip.getMoney());
//        ((UsableItem) potion).initialize();
//        potion.getBuyValue();
    }
}
