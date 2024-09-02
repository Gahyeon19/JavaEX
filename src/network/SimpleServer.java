package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(5000);
      Socket connection = serverSocket.accept();
      InputStream is = connection.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(is);
      String msg = (String) ois.readObject();
      System.out.println("받은 문자열 : " + msg);
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
