package lesson6;

public class Dog extends Animal {
    public Dog(int runMetr, int swimMetr) {
        super(runMetr, swimMetr);
    }

    @Override
    public void run() {
        if (500 > runMetr){
            System.out.println("Собака пробежала - " + runMetr + "м");
        }else {
            System.out.println("Собака не способена пробежать такую дистанцию");
        }
    }

    @Override
    public void swim() {
        if (10 > swimMetr){
            System.out.println("Собака проплыла - " + swimMetr + "м");
        }else {
            System.out.println("Собака не способена пробежать такую дистанцию");
        }
    }
}
