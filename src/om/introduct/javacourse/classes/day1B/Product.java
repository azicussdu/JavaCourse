package om.introduct.javacourse.classes.day1B;

public class Product {
    long id;
    String name;
    int amount;
    double price;

    void updatePrice(double price){
        price = price;
    }

    void addAmount(int amount){
        this.amount = this.amount + amount;
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
