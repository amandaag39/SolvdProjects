public class Main {
    public static void main(String[] args) {

        //Instantiate some Products
        Product product = new Product("Flare Jean", 129.99);
        ClothingItem clothingItem = new ClothingItem("70s Romper", 249.99, "Medium", "Beige");
        Dresses dresses = new Dresses("Tiffany", 149.99, "Small", "Floral", "Sundresses");
        Tops tops = new Tops("Minimalist Tank", 155.49, "Large", "White", "Tanks");
        Bottoms bottoms = new Bottoms("Intense Bellbottoms", 189.97, "Extra-Small","Black","Pants");
        AccessoriesItem accessoriesItem = new AccessoriesItem("Couture Clutch", 149.99);
        Bags bags = new Bags("Fiona", 127.49, "Backpack");
        Jewelry jewelry = new Jewelry("Butterfly Kisses", 349.99, "Necklace");
        Hats hats = new Hats("Chelsea",115,"Straw");

        //Instance of Customer
        CustomerInfo customerInfo = new CustomerInfo("Jamie","Potter","jpotter@gmail.com","StrongPassword123","123 Fake Street Chicago, IL 60617", "123 Fake Street Chicago, IL 60617", "773-867-5309");

        //Test the methods
        String productName = product.getName();
        System.out.println(productName); //This will print "Flare Jean"

        String clothingItemColor = clothingItem.getColor();
        System.out.println(clothingItemColor); // This will print "Beige"

        double dressesPrice = dresses.getPrice();
        System.out.println(dressesPrice); //This will print "149.99"

        String topsSize = tops.getSize();
        System.out.println(topsSize); //This will print "Large"

        String bottomsType1 = bottoms.getBottomsType();
        System.out.println(bottomsType1); //This will print "Pants"

        double accessoriesItemPrice = accessoriesItem.getPrice();
        System.out.println(accessoriesItemPrice); //This will print "149.99"

        String bagsType1 = bags.getBagsType();
        System.out.println(bagsType1); //This will print "Backpack"

        String jewelryName = jewelry.getName();
        System.out.println(jewelryName); //This will print "Butterfly Kisses"

        double hatsPrice = hats.getPrice();
        System.out.println(hatsPrice); //This will print "115.00"

        String customerInfoLastName = customerInfo.getLastName();
        System.out.println(customerInfoLastName); //This will print "Potter"
    }
}