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
    private ArrayList<String> skillList = new ArrayList<>();

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
            throw new IllegalArgumentException("not enough money");
        }

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setExp(double exp) {
        this.exp = exp;
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
            throw new IllegalArgumentException("not enough value");
        }
    }

//    public void getSkillList() {
//        for (int i = 0; i < skillList.size(); i++) {
//            System.out.println(skillList.get(i).getName()+skillList.get(i).getLevel());
//        }
//    }

    public void learnSkill(Skill skill) {
        int count = 0;
        if (skillList.contains(skill.getName())) {
            for (int i = 0; i < skillList.size() - 1 && count < 1; i++) {
                count++;
                skill.increaseSkillLevel();
                skillList.set(i + 1, String.valueOf(skill.getLevel()));
            }

        } else {
            skillList.add((skill.getName()));
            skill.increaseSkillLevel();
            skillList.add(String.valueOf((skill.getLevel())));
        }
    }

    public void castSpell(ActiveSkill activeSkill) {
        System.out.println("use spell: " + activeSkill.getName());
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < skillList.size(); i++) {
            result += skillList.get(i) + " ";
        }
        return result;
    }


    public void useItem(UsableItem usableItem) {
        if (usableItem.getQuantity() >= 1) {
            this.setHp(getHp() + usableItem.getIncreaseHp());
            this.setDamage(getDamage() + usableItem.getIncreaseDmg());
            this.setDefense(getDefense() + usableItem.getIncreaseDef());
            usableItem.decreaseQuantity(1);
        } else {
            throw new IllegalArgumentException("not enough value");
        }
    }


    public double getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String catchBy(MonsterBall monsterBall) {
        String s = "failed";
        if (monsterBall.getQuantity() >= 1) {
            monsterBall.decreaseBall();
            if (Math.random() < 0.5) {
                s = "success";
                this.setExp(getExp() + 10);
                levelUp();
            }
        } else {
            throw new IllegalArgumentException("not enough value");
        }
        return s;
    }

    public void levelUp() {
        if (getExp() >= 100) {
            this.setLevel(getLevel() + 1);
            this.setExp(0);
        }
    }

}
