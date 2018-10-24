import java.util.ArrayList;
import java.util.Arrays;

public class GameCharacter {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private double money;
    private int level;
    private double exp;

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

    public void buy(Item item, int quantity) {
        if (this.getMoney() > item.getBuyValue() * quantity) {
            this.setMoney(this.getMoney() - item.getBuyValue() * quantity);
            receiveItems(item, quantity);
        } else {
            System.err.println("not enough money");
        }

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void receiveItems(Item item, int quantity) {
        item.increaseQuantity(quantity);
    }

    public void sell(Item item, int quantity) {
        if (item.getQuantity() > quantity) {
            this.setMoney(this.getMoney() + item.getSellValue() * quantity);
            item.decreaseQuantity(quantity);
        } else {
            System.err.println("not enough item");
        }
    }
    public void learnSkill(Skill skill){
        skill.setLevel(skill.getLevel()+1);
    }
    public void castSpell(ActiveSkill activeSkill) {
        System.out.println("use spell: " + activeSkill);
    }

    public void useItem(UsableItem usableItem) {
        if (usableItem.getQuantity() >= 1) {
            this.setHp(getHp() + usableItem.getIncreaseHp());
            this.setDamage(getDamage() + usableItem.getIncreaseDmg());
            this.setDefense(getDefense() + usableItem.getIncreaseDef());
            usableItem.decreaseQuantity(1);
        } else {
            System.err.println("not enough item");
        }
    }


    public void catchBy(MonsterBall monsterBall) {
        if (monsterBall.getQuantity() >= 1) {
            monsterBall.decreaseBall();
        } else {
            System.err.println("not enough item");
        }
    }

}
