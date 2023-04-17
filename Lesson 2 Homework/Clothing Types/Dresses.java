public class Dresses extends ClothingItem {
    private String dressesType;

    public Dresses(String name, double price, String size, String color, String dressesType) {
        super(name, price, size, color);
        this.dressesType = dressesType;
    }

    public String getDressesType() {
        return dressesType;
    }

    public void setType(String dressesType) {
        this.dressesType = dressesType;
    }
}
