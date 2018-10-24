import java.util.ArrayList;
import java.util.HashMap;

public class UsableItem extends Item {
    private int increaseHp;
    private int increaseDmg;
    private int increaseDef;

    public UsableItem(String name, int buyValue, int sellValue, int quantity, int increaseHp, int increaseDmg, int increaseDef) {
        super(name, buyValue, sellValue, quantity);
        this.increaseHp = increaseHp;
        this.increaseDmg = increaseDmg;
        this.increaseDef = increaseDef;
    }


    public int getIncreaseHp() {
        return increaseHp;
    }

    public void setIncreaseHp(int increaseHp) {
        this.increaseHp = increaseHp;
    }

    public int getIncreaseDmg() {
        return increaseDmg;
    }

    public void setIncreaseDmg(int increaseDmg) {
        this.increaseDmg = increaseDmg;
    }

    public int getIncreaseDef() {
        return increaseDef;
    }

    public void setIncreaseDef(int increaseDef) {
        this.increaseDef = increaseDef;
    }


}
