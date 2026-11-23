package om.introduct.javacourse.classes.day1A;

public class Main2 {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.id = 2;
        p1.amount = 10;
        p1.price = 5.5;

        double totalPrice = p1.getTotalPrice();
        System.out.println("total price: " + totalPrice);

//        p1.printInfo();
//
//        p1.addAmount(5);
//        p1.printInfo();


    }
}








