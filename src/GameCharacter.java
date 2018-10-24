public class GameCharacter {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private double money;
    private int level;
    private double exp;
    private GameCharacter gameCharacter;
    private UsableItem usableItem;

    public GameCharacter(String name, int hp, int damage, int defense, int level, double exp, double money) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.money = money;
        this.level = level;
        this.exp = exp;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void buy(UsableItem usableItem, int quantity) {
        if (this.getMoney() > usableItem.getBuyValue() * quantity) {
            this.setMoney(this.getMoney() - usableItem.getBuyValue() * quantity);
            receiveItems(usableItem, quantity);
        } else {
            System.err.println("not enough money");
        }

    }

    public void receiveItems(UsableItem usableItem, int quantity) {
        usableItem.setQuantity(quantity);

    }
    public void sell(UsableItem usableItem,int quantity){
        if (usableItem.getQuantity()>quantity){


        }
    }


}
