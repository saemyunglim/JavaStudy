package Lambda;

public class MainClass {
    public static void main(String[] args) {

        //람다식 이용하여 인터페이스를 구현하지 않고 인터페이스 내부의 메서드를 바로 정의하여 사용하는 예제
        Interface1 i1 = (String s, int i, char c) -> {
            System.out.println("입력된 값: " + s + i + c);
        };

        i1.method1("hello", 3, 'm');

        Interface2 i2 = (int x, int y) -> {
            int result = x + y;
            return result;
        };

        Interface2 i3 = (int x, int y) -> {
            int result = x * y;
            return result;
        };

        System.out.println(i2.method2(3, 5));
        System.out.println(i3.method2(3, 5));
    }
}
