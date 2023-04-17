public class Bags extends AccessoriesItem {
    private String bagsType;

    public Bags(String name, double price, String bagsType) {
        super(name, price);
        this.bagsType = bagsType;
    }

    public String getBagsType() {
        return bagsType;
    }

    public void setType(String bagsType) {
        this.bagsType = bagsType;
    }
}
