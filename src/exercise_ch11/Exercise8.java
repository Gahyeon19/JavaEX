package exercise_ch11;

//이것이 자바다 15장 확인문제8
/**
 * 학번이 같으면 동일한 Student 라고 가정하고 중복 저장이 되지 않도록 하는 코드 작성
 * Student 객체의 해시코드는 학번이라고 가정
 */
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Exercise8 {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<>();

    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "신용권"));
    set.add(new Student(1, "조민우")); //학번이 같으면 중복이 되므로 Student(1, "조민우")는 저장안됨.

    System.out.println("저장된 객체 수 : " + set.size());
    for (Student student : set) {
      System.out.println(student.studentNum + " : " + student.name);
    }
  }
}

class Student{
  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student student)) return false;
    return studentNum == student.studentNum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentNum);
  }
}
