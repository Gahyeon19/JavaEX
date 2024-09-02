package advanced2;

public class ThreadDemo2 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread().getName());   //main

    Thread thread3 = new Thread(new Runnable() {    //예외 발생하지만 message 출력 후 thread0, thread1, thread2는 정상적으로 출력됨
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          int res = 5/0;    //Exception 발생
          System.out.println(res);
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }

      }
    });

    Thread thread0 = new Thread(new Task());
    Thread thread1 = new Thread(new Task());
    Thread thread2 = new Thread(new Task());

    thread3.start();

    System.out.println(Thread.currentThread().getName());   //예외 발생 위치에 따라 영향을 주는 상황이 달라진다.
    int res = 5/0;    //Exception 발생
    System.out.println(res);

    thread0.start();   //thread0, thread1, thread2가 순서 상관 없이 출력된다.
    thread1.start();
    thread2.start();

  }
}

class Task implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
