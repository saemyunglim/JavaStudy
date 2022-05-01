package Implement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MainClass {
    public static void main(String[] args) {
        InterfaceA a = new InterfaceClass();
        InterfaceB b = new InterfaceClass();

        a.runA();
        b.runB();
    }
}