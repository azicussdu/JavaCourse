package om.introduct.javacourse.classes.day1A;

public class Product {
    long id;
    String name;
    int amount;
    double price;

    double getTotalPrice(){
        return amount * price;
    }

    void addAmount(int amount){
        this.amount = this.amount + amount;
    }

    void printInfo(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
        System.out.println("price: " + price);
        System.out.println("-------------------");
    }
}
