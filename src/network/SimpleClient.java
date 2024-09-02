package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("localhost", 5000);
      OutputStream os;
      ObjectOutputStream oos ;

      for (int i = 0; i < 3; i++) {
        os = client.getOutputStream();
        oos = new ObjectOutputStream(os);
        oos.writeObject("Hi, Simple Server");
        oos.flush();
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
