package InputOutput.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputClass {
    public static void main(String[] args) {
        InputStream inputStream = null;

        try { //아래와 같이 데이터를 입출력해줄때 사용하는 Stream 이용시 반드시 예외처리 해줘야함
            inputStream = new FileInputStream("C:\\file.txt");
            int data = 0;

            while (true) {
                try {
                    data = inputStream.read(); //1바이트씩 읽어옴(몇바이트씩 읽어올지 정해줄 수도 있음)
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (data == -1) break; //데이터가 없을 경우 반복문 종료
                System.out.println("data: " + data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
