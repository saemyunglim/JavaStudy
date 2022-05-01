package Extend;

public class ChildClass extends ParentClass{

    int num = 1;

    public ChildClass() {
        System.out.println("ChildClass Constructor");
    }

    public void runChildClass() {
        System.out.println("ChildClass is running");
    }

    @Override
    public void beforeOverride() {
        System.out.println("This is made after override");
    }

    public void numOutput() {
        System.out.println("ChildClass's num:" + this.num);
        System.out.println("ParentClass's num:" + super.num);
    }
}
