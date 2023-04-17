public class Bottoms extends ClothingItem {
    private String bottomsType;

    public Bottoms(String name, double price, String size, String color, String bottomsType) {
        super(name, price, size, color);
        this.bottomsType = bottomsType;
    }

    public String getBottomsType() {
        return bottomsType;
    }
    public void setType(String bottomsType) {
        this.bottomsType = bottomsType;
    }
}
