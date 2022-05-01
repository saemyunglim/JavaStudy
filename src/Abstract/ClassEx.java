package Abstract;

import sun.security.rsa.RSAUtil;

public class ClassEx extends AbstractClassEx {

    public ClassEx() {
        System.out.println("ClassEx Constructor");
    }

    public ClassEx(int i, String s) {
        super(i, s);
    }

    @Override
    public void func2() {
        System.out.println("AbstractClassEx's abstract method is made by ClassEx");
        super.printVar();
    }

}
