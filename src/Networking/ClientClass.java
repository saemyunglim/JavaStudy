package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
    public static void main(String[] args) {
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        Scanner scanner = null;

        try {
            socket = new Socket("localhost", 9000);
            System.out.println("서버와 연결성공!");

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            scanner = new Scanner(System.in);

            while (true) {
                System.out.println("서버측으로 보낼 메세지 입력: ");
                String insertFromUser = scanner.nextLine();
                dataOutputStream.writeUTF(insertFromUser);
                dataOutputStream.flush();

                String messageFromServer = dataInputStream.readUTF();
                System.out.println("서버측: " + messageFromServer);

                if (insertFromUser.equals("stop")) break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
                if (inputStream != null) inputStream.close();
                if (dataInputStream != null) dataInputStream.close();
                if (outputStream != null) outputStream.close();
                if (dataOutputStream != null) dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
