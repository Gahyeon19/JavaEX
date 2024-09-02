package advanced2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
  public static void main(String[] args) {
    Runnable task = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getName() + " : " + i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {

        }
      }
    };

//    Thread thread = new Thread(task);

    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.submit(task);
    executorService.shutdown();

    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " : " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {

      }
    }

//    main : 0
//    pool-1-thread-1 : 0
//    main : 1
//    pool-1-thread-1 : 1
//    main : 2
//    pool-1-thread-1 : 2
//    main : 3
//    pool-1-thread-1 : 3
//    main : 4
//    pool-1-thread-1 : 4
  }
}
