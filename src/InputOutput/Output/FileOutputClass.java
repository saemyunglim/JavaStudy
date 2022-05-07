package InputOutput.Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputClass {
    public static void main(String[] args) {
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("C:\\file.txt");
            String data = "Hello Python";
            byte[] bArr = data.getBytes();

            try {
                outputStream.write(bArr); //해당 파일에 입력하고자 하는 값을 써줌
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
