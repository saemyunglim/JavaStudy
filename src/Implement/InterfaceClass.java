package Implement;

public class InterfaceClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD {

    @Override
    public void runA() {
        System.out.println("InterfaceA is running");
    }

    @Override
    public void runB() {
        System.out.println("InterfaceB is running");
    }

    @Override
    public void runC() {
        System.out.println("InterfaceC is running");
    }

    @Override
    public void runD() {
        System.out.println("InterfaceD is running");
    }
}
