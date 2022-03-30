package lesson6;

public class Animal {
    protected final int runMetr;
    protected final int swimMetr;

    public Animal(int runMetr, int swimMetr){
        this.runMetr = runMetr;
        this.swimMetr = swimMetr;
    }
    public int getRunMetr() {
        return runMetr;
    }
    public int getSwimMetr() {
        return swimMetr;
    }

    public void run(){
        System.out.println("Животное умеет бегать");

    }
    public void swim(){
        System.out.println("Животное умеет плавать");
    }
}
