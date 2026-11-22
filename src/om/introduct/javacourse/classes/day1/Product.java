package om.introduct.javacourse.classes.day1;

public class Product {
    long id;
    String name;
    int amount;
    double price;

    void updatePrice(double newPrice){
        price = newPrice;
    }

    void addAmount(int amnt){
        amount = amount + amnt;
    }

    void printInfo(){
        System.out.println("ID of product: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Amount available: " + amount);
        System.out.println("Price for each: " + price);
    }

    double getRevenue(){
        return amount * price;
    }
}
