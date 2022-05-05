package Exception;

public class TestClass2 {
    public static void main(String[] args) { //testMethod에서 예외처리를 하도록 해서  6,7번째줄의 코드 모두 실행가능 --> 예외처리를 어디서 어떻게 할지가 정말 중요!!!
        TestClass2 testClass2 = new TestClass2();
        testClass2.testMethod(5);
        testClass2.testMethod(10);

    }

    public void testMethod(int num) {
        try {
            int i = num / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
