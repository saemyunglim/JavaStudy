package Object;

public class MainClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(1, "first");
        System.out.println(testClass.getClassName());
        testClass.setClassName("second");
        System.out.println(testClass.getClassName());
    }
}
