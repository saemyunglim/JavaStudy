package Exception;

public class TestClass {
    public static void main(String[] args) {
        try { //try문 안에서는 첫번째 오류만 찾고 바로 catch문으로 넘어가버린다는 문제가 발생
            TestClass testClass = new TestClass();
            testClass.testMethod(5);
            testClass.testMethod(10);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void testMethod(int num) throws Exception{
        int i = num / 0;
    }

}
