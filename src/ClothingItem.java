public class ClothingItem {
    private String name;
    private double price;
    private String size;
    private String color;

    public ClothingItem (String name, double price, String size, String color) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public ClothingItem() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
