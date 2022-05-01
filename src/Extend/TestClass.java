package Extend;

public class TestClass {
    public static void main(String[] args) {
//        ChildClass cc = new ChildClass();
//        cc.runParent();
//        cc.runChildClass();
//        cc.beforeOverride();

        ParentClass[] pArr = new ParentClass[2];
        ParentClass pClass = new ChildClass();
        ParentClass pClass2 = new ChildClass2();

        pArr[0] = pClass;
        pArr[1] = pClass2;

        for (int i = 0; i < pArr.length; i++) {
            System.out.println("pArr"+i+1+"은 "+pArr[i]+"입니다.");
        }

        ChildClass cc = new ChildClass();
        cc.numOutput();
    }
}
