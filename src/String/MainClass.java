package String;

public class MainClass {
    public static void main(String[] args) {

        //원래 String도 객체자료형이기 때문에 아래와 같이 표현해야하지만 자주 사용하는 표현형이라 기본자료형처럼 정의하도록 해줌
        String str = new String("hello");
        //여기서 위의 str과 아래의 str 모두 메모리를 차지함으로 용량낭비의 문제가 존재
        str += " java";
        System.out.println(str);

        //용량낭비를 막기위해 StringBuilder 또는 StringBuffer의 append()함수를 이용함
        //StringBuilder 보다는 StringBuffer가 안정적이지만 빠른 속도를 위해 StringBuilder를 사용함
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append(" java");
        System.out.println(sb);
        System.out.println(sb.length()); //해당 문자열의 길이
        sb.insert(6, "welcome to "); //해당 문자열 사이 원하는 위치에 원하는 문자 추가
        System.out.println(sb);
        sb.delete(5, 16); //해당 문자열 사이 임의의 위치 삭제
        System.out.println(sb);
    }
}
