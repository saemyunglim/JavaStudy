package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerClass {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        Scanner scanner = null;

        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트와의 연결 준비중!");

            socket = serverSocket.accept();
            System.out.println("클라이언트와 연결성공!");
            System.out.println("socket: " + socket);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            scanner = new Scanner(System.in);

            while (true) {
                String messageFromClient = dataInputStream.readUTF();
                System.out.println("클라이언트측: " + messageFromClient);

                System.out.println("클라이언트측으로 보낼 메세지 입력: ");
                String insertFromServer = scanner.nextLine();

                dataOutputStream.writeUTF(insertFromServer);
                dataOutputStream.flush();

                if (insertFromServer.equals("stop")) break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
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
