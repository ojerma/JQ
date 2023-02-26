package lesson1;

public class Person {
        String fullName;
        int age;

    public Person() {
        new Person();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

        new Person();
    }

    public void move(){

        }
        public void talk(){

        }

    public static void main(String[] args) {
        System.out.println("Такой-то Person говорит");
    }

}
