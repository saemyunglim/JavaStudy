package Implement.toy;

public class ToyAirplane implements Toy{

    @Override
    public void walk() {
        System.out.println("This Airplane cannot walk");
    }

    @Override
    public void run() {
        System.out.println("This Airplane cannot run");
    }

    @Override
    public void alarm() {
        System.out.println("This Airplane have alarm func");
    }

    @Override
    public void light() {
        System.out.println("This Airplane have light func");
    }
}
