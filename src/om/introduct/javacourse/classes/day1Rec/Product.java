package om.introduct.javacourse.classes.day1Rec;

public class Product {
    long id;
    String name;
    int amount; // amount that are available for sale
    double price; // price for each product

    void addAmount(int amount){
        this.amount = this.amount + amount;
    }

    void describe(){
        System.out.println("id: " + id);
        System.out.println("product name: " + name);
        System.out.println("amount available: " + amount);
        System.out.println("price for 1 piece: " + price);
        System.out.println("------------------------------");
    }
}
