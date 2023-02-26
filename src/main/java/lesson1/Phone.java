package lesson1;

public class Phone {
    int number;
    String model;
    int weight;
    String name;

    public static void main(String[] args) {

        int number = 545656778;
        String model = "iPhone";
        int weight = 450;
        System.out.println(number + model + weight);
    }

        public void receiveCall(){
            String name = "Olga";
            System.out.println("Звонит" + name);
    }
    public void getNumber(){
        int number = 545656778;
        System.out.println(number);
    }
}





