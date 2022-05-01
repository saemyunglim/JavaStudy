package Abstract;

public abstract class AbstractClassEx {

    int i;
    String s;

    public AbstractClassEx() {
        System.out.println("AbstractClassEx Constructor");
    }

    public AbstractClassEx(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public void func1() {
        System.out.println("AbstractClassEx's func1 method is running");
    }

    public abstract void func2();

    public void printVar() {
        System.out.println("s: " + s + ", i:" + i);
    }
}
