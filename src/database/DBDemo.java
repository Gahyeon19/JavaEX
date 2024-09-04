package database;

import java.sql.*;

public class DBDemo {

  public static void main(String[] args) throws SQLException {
    Connection con = makeConnection();
    createNewPerson(con);

  }

  private static void createNewPerson(Connection con) throws SQLException {
    Statement stmt = con.createStatement();
    String sql = "insert into person (name, phone, email) values ('Hong', '010-1111-1111', 'Hong@a.com');";
//    ResultSet rs = stmt.executeQuery(sql);

    int res = stmt.executeUpdate(sql);
    System.out.println(res + "개의 데이터가 추가되었습니다.");
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
