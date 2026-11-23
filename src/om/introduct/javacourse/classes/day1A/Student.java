package om.introduct.javacourse.classes.day1A;

public class Student {
    long id;
    String name;
    int age;
    double gpa;

    Student(long id, String name){
        this.id = id;
        this.name = name;
    }

    Student(long id, String name, int age, double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void introduce(){
        System.out.println("My ID is " + id);
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My gpa is " + gpa);
        System.out.println("---------------------");
    }
}






