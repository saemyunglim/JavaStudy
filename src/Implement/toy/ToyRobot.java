package Implement.toy;

public class ToyRobot implements Toy{

    @Override
    public void walk() {
        System.out.println("This Robot can walk");
    }

    @Override
    public void run() {
        System.out.println("This Robot can run");
    }

    @Override
    public void alarm() {
        System.out.println("This Robot have no alarm func");
    }

    @Override
    public void light() {
        System.out.println("This Robot have light func");
    }
}
