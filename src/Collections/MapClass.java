package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>(); //Map은 중복되지 않는 key값을 통해 데이터를 관리함

        map.put(1, "Java");
        map.put(3, "C");
        map.put(5, "Python");

        map.put(5, "Js"); //Map의 key값에 해당하는 값 변경

        map.remove(5); //해당 key값에 해당하는 값 삭제

        System.out.println(map.size());

        System.out.println(map);
        System.out.println(map.getClass().getName());

        System.out.println(map.get(1));
        System.out.println(map.get(1).getClass().getName());

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Java"));

        map.clear(); //데이터 전체 제거
        System.out.println(map.isEmpty()); //해당 Map이 비었는지 확인
    }
}
