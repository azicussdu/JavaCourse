package om.introduct.javacourse.classes.day1;

public class Main {
    public static void main(String[] args) {

        // how we create an object of class Student
        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Asaad";
        st1.age = 24;
        st1.gpa = 3.7;

        st1.introduce();
        System.out.println("---------------------");

//        System.out.println(st1.name); // shows only address of an object

        Student st2 = new Student();
        st2.id = 2;
        st2.name = "Mowadah";
        st2.gpa = 3.7;

        st2.introduce();

    }
}
