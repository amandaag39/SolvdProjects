public class AccessoriesItem {
    private String name;
    private double price;

    public AccessoriesItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AccessoriesItem(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
