package om.introduct.javacourse.classes.day1B;

public class Student {
    long id;
    String name;
    int age;
    double gpa;

    Student(){}

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(long id, String name, int age, double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void introduce(){
        System.out.println("My ID is: " + id);
        System.out.println("Hi, my name is " + name);
        System.out.println("I am  " + age + " years old");
        System.out.println("I have  " + gpa + " gpa");
    }
}








