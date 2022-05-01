package Extend;

public class ParentClass {

    int num = 0;

    public ParentClass() {
        System.out.println("ParentClass Constructor");
    }

    public void runParent() {
        System.out.println("ParentClass is running");
    }

    public void beforeOverride() {
        System.out.println("This is made before override");
    }
}
