package lesson1;

public class Main {
    public static void main(String[] args) {


        int i;
        Dog dog;

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Барбос");
        Dog dog3 = new Dog(3);
        Dog dog4 = new Dog(3, "Барбос");

        System.out.println(dog2.name);
        System.out.println(dog3.age);

        dog3.bark();
        dog1.bark();
    }
}
