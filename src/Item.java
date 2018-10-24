
public class Item{
    protected String name;
    protected int buyValue;
    protected int sellValue;
    protected int quantity;

    public Item(String name, int buyValue, int sellValue, int quantity) {
        this.name = name;
        this.buyValue = buyValue;
        this.sellValue = sellValue;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(int buyValue) {
        this.buyValue = buyValue;
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }

    public int getQuantity() {
        return quantity;
    }



    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }



}
