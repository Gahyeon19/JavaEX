package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo2 {

  public static void main(String[] args) throws SQLException {
    Connection con = makeConnection();
    changeEmail(con);

  }

  private static void changeEmail(Connection con) throws SQLException {
    String sql = "update person set email = ? where phone = ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, "Kimm@a.com");         //첫번째 ?자리
    ps.setString(2, "010-5555-5555");      //두번째 ? 자리

    int res = ps.executeUpdate();
    if (res == 0) {
      System.out.println("데이터 수정이 정상적으로 진행되지 않았습니다.");
    }
    else {
      System.out.println(res + "개의 데이터가 수정되었습니다.");
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
