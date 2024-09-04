package database;

import java.sql.*;

public class DBDemo4 {

  public static void main(String[] args) throws SQLException {
    Connection con = makeConnection();
    getPersonInfos(con);

  }

  private static void getPersonInfos(Connection con) throws SQLException {
    String sql = "select * from person;";
    PreparedStatement ps = con.prepareStatement(sql);

    ResultSet rs = ps.executeQuery();
//    System.out.println(rs.next());                     //true
//    System.out.println(rs.getString(1));    //첫번째 항목 가져오기   //Hong
//    System.out.println(rs.next());                     //true
//    System.out.println(rs.getString(1));    //다음 항목 가져오기     //Son
//    System.out.println(rs.next());                     //true
//    System.out.println(rs.getString(1));    //다음 항목 가져오기     //Lee
//    System.out.println(rs.next());                     //false

    while (rs.next()){
      System.out.println(rs.getString(1) + " : " + rs.getString(2) + " , " + rs.getString(3));
    }

    rs.close();
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
