
public class MonsterBall extends Item{
    private boolean haveMasterBall = false;


    public MonsterBall(String name, int buyValue, int sellValue, int quantity) {
        super(name, buyValue, sellValue, quantity);
    }

    public void isBuyMasterBall() {
        if (super.buyValue == 9999) {
            haveMasterBall = true;
            System.err.println("Cannot be brought");
        }
    }

    public void isSellMasterBall() {
        if (super.sellValue == 9999) {
            haveMasterBall = true;
            System.err.println("Cannot be sold");
        }
    }

    public void decreaseBall() {
        this.quantity--;
    }

}
