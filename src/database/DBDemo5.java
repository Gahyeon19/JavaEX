package database;

import javax.naming.spi.DirObjectFactory;
import java.sql.*;
import java.util.Scanner;

public class DBDemo5 {

  public static void main(String[] args) throws SQLException {
    Connection con = makeConnection();
    getSpecificPersonInfo(con);

  }

  private static void getSpecificPersonInfo(Connection con){

    Scanner sc = new Scanner(System.in);
    System.out.print("전화번호를 입력하세요 : ");
    String phone = sc.nextLine();
    String sql = "select * from person where phone = ?";
    ResultSet rs = null;
    try {
      PreparedStatement ps = con.prepareStatement(sql);

      ps.setString(1,phone);
      rs = ps.executeQuery();

      if (!rs.isBeforeFirst()){
        System.out.println("조건에 맞는 데이터가 없습니다.");
      } else {
        rs.next();
        System.out.println(rs.getString(1) + " : " + rs.getString(2) + " , " + rs.getString(3));

      }
      rs.close();
    } catch (SQLException e){
      System.out.println("SQL 실행 중 오류 발생");
    }

  }

  public static Connection makeConnection(){
    String url = "jdbc:mysql://localhost/javaex?serverTimezone=Asia/Seoul";
    Connection con = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      System.out.println("=== 데이터베이스 연결 중 ===");

      con = DriverManager.getConnection(url, "root", "0119");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
      System.out.println(e.getMessage());
    }
    return con;
  }
}
