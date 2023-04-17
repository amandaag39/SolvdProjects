public class Jewelry extends AccessoriesItem {
    private String jewelryType;

    public Jewelry (String name, double price, String jewelryType) {
        super(name, price);
        this.jewelryType = jewelryType;
    }

    public String getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(String jewelryType){
        this.jewelryType = jewelryType;
    }
}
