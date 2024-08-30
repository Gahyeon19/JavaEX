package advanced2;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
//    thread.run();


    long before = System.currentTimeMillis();
    for (int i = 0; i < 5; i++) {
      System.out.println("This is Main");
      Thread.sleep(500);
    }
    
    long after1 = System.currentTimeMillis();
    System.out.println(after1 - before);


    // thread.start(); 출력결과
    //This is Main
    //HI !
    //This is Main
    //HI !
    //HI !
    //This is Main
    //HI !
    //This is Main
    //HI !
    //This is Main
    //Runnable

    // thread.run(); 출력결과
    //HI !
    //HI !
    //HI !
    //HI !
    //HI !
    //Runnable
    //This is Main
    //This is Main
    //This is Main
    //This is Main
    //This is Main

  }
}

class MyThread extends Thread{
  @Override
  public void run() {
    System.out.println("My Thread");
  }
}

class MyRunnable implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("HI !");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    System.out.println("Runnable");
  }
}
