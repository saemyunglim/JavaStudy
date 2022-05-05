package Exception;

public class TryCatchClass {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int r = 0;

        System.out.println("Exception Before");

        try {
            r = i / j; //예외가 발생할 수 있는 구문 입력
                       //만일 try문 안 여러 구문 중 앞의 구문에서 Exception이 발생할 경우 뒷구문 스킵하고 바로 Catch로 이동
        } catch (Exception e) {
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
        } finally {
            System.out.println("이건 무조건 출력됨"); //finally를 이용하여 꼭 필요한 구문 무조건적으로 실행가능
        }

        System.out.println("Exception After"); //예외처리를 시스템이 중단되어 이줄이 출력x
    }
}
