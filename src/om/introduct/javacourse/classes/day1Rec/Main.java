package om.introduct.javacourse.classes.day1Rec;

public class Main {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        st1.id = 1;
//        st1.name = "Asaad";
//        System.out.println(st1.name);
//
//        Student st2 = new Student();
//        st2.id = 2;
//        st2.name = "Marya";
//        st2.gpa = 3.7;

        Product p1 = new Product();
        p1.id = 1;
        p1.name = "Juice";
        p1.amount = 10;
        p1.price = 1.1;

        p1.describe();
        // I can make a product describe itself

        p1.addAmount(5);

        p1.describe();
    }
}
