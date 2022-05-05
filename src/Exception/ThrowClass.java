package Exception;

public class ThrowClass {
    public static void main(String[] args) {
        ThrowClass throwClass = new ThrowClass();

        try {
            throwClass.firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void firstMethod() throws Exception{ //throws는 예외처리를 직접하지 않고 호출한 곳으로 넘김
                                                //이 메서드에서 어떤 오류가 발생할 수 있는지 선언부만 보고 확인가능
        secondMethod();
    }

    public void secondMethod() throws Exception{
        thirdMethod();
    }

    public void thirdMethod() throws Exception{
        System.out.println("10 / 0: " + (10 / 0));
    }
}
