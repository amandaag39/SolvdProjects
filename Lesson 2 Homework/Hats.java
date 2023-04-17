public class Hats extends AccessoriesItem {
    private String hatsType;

    public Hats (String name, double price, String hatsType) {
        super(name, price);
        this.hatsType = hatsType;
    }

    public String getHatsType() {
        return hatsType;
    }

    public void setHatsType(String hatsType) {
        this.hatsType = hatsType;
    }
}
