package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress addr1 = null, addr2 = null;
    Scanner sc = new Scanner(System.in);

    System.out.print("호스트 이름을 입력하세요 : ");
    String url =  sc.nextLine();

    addr1 = InetAddress.getByName(url);
    addr2 = InetAddress.getLocalHost();

    System.out.println(addr1.getHostAddress());   //입력한 Host 의 IP 주소
    System.out.println(addr2.getHostAddress());   //로컬 IP 주소
  }
}
