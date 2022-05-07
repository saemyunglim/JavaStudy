package InputOutput.Output;

import sun.reflect.annotation.ExceptionProxy;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputClass {
    public static void main(String[] args) {

        String str = "Hello Java";
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        try {
            outputStream = new FileOutputStream("C:\\file.txt");
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
