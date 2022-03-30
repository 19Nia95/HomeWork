package lesson6;

public class Cat extends Animal {
    public Cat(int runMetr, int swimMetr) {
        super(runMetr, swimMetr);
    }

    @Override
    public void run() {
        if (200 > runMetr){
            System.out.println("Кот пробежал - " + runMetr + "м");
        }else {
            System.out.println("Кот не способен пробежать такую дистанцию");
        }
    }

    @Override
    public void swim() {
        System.out.println("Коты не умеют плавать");
    }

}
