package lesson1;

public class Dog {

    String breed;
    int age;
    String color;
    String name;

    public Dog(){
        System.out.println("ВЫзван конструктор Dog");
    }
    public Dog(String name){
        this.name = name;
        System.out.println("Вызван конструктор с параметром Name");
    }
    public Dog(int age){
        this.age = age;
        System.out.println("Вызван конструктор с параметром Age");
    }
    public Dog(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("ВЫзван конструктор с параметрами Age и Name");
    }

    public Dog(String breed, int age, String color, String name) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    void bark() {
        System.out.println("Woof!");
    }

    void sleep() {
    }
}
