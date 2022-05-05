package Collections;

import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //ArrayList는 인덱스를 활용해서 데이터를 관리함

        list.add("Hello");
        list.add("Java");
        list.add("World");
        list.add(2, "Programing"); //해당 인덱스에 해당 문자열 삽입
        list.set(1, "Python"); //해당 인덱스에 원래 있던 문자열을 변경

        System.out.println(list.size()); //해당 ArrayList의 크기

        System.out.println(list);
        System.out.println(list.getClass().getName()); //.getClass().getName()을 통해 자료형 파악

        System.out.println(list.get(0));
        System.out.println(list.get(0).getClass().getName());

        String str = list.get(2); //해당 인덱스의 값 가져오기
        str = list.remove(2); //해당 인덱스의 값 제거
        list.clear(); //ArrayList의 모든 값 제거


        boolean isEmpty = list.isEmpty(); //해당하는 ArrayList가 비었는지 확인
    }
}
