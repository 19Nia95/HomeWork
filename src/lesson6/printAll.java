package lesson6;

public class printAll {
    public static void main(String[] args) {
        Cat cat = new Cat(150, 5);
        Dog dog = new Dog(250, 9);


        System.out.println("----Cat----");
        cat.run();
        cat.swim();
        System.out.println("----Dog----");
        dog.run();
        dog.swim();
    }
}
