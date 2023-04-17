public class Tops extends ClothingItem {
    private String topsType;

    public Tops(String name, double price, String size, String color, String topsType) {
        super(name, price, size, color);
        this.topsType = topsType;
    }

    public String getTopsType() {
        return topsType;
    }
    public void setType(String topsType){
        this.topsType = topsType;
    }
}
