package om.introduct.javacourse.classes.day1B;

public class Main {
    public static void main(String[] args) {

//        // how we create an object of class Student
//        Student st1 = new Student();
//        st1.id = 1;
//        st1.name = "Asaad";
//        st1.age = 24;
//        st1.gpa = 3.7;
//
//        st1.introduce();
//        System.out.println("---------------------");
//
////        System.out.println(st1.name); // shows only address of an object
//
//        Student st2 = new Student();
//        st2.id = 2;
//        st2.name = "Mowadah";
//        st2.gpa = 3.7;
//
//        st2.introduce();


        //-------- testing Product class -----------
        Product p1 = new Product();
        p1.id = 1;
        p1.name = "Basketball ball";
        p1.price = 23.5;
        p1.amount = 10;

        // this method is void (so it doesn't return anything)
        p1.printInfo();
        System.out.println("----------------");

        // method returns you back double value
        double myRevenue = p1.getRevenue();
        System.out.println("myRevenue: " + myRevenue);

        p1.addAmount(5);
        p1.printInfo();
        System.out.println("myRevenue: " + p1.getRevenue());

        System.out.println("------------------");
        p1.updatePrice(40.5);
        p1.printInfo();

    }
}
