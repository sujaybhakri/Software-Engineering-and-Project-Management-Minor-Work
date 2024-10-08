class CounterThread extends Thread {
  private String threadName;

  CounterThread(String name) {
      threadName = name;
  }

  public void run() {
      for (int i = 1; i <= 5; i++) {
          System.out.println(threadName + " Count: " + i);
          try {
              Thread.sleep(100); // Sleep to simulate work
          } catch (InterruptedException e) {
              System.err.println(threadName + " interrupted.");
          }
      }
  }
}

public class Multithreading{
  public static void main(String[] args) {
      CounterThread thread1 = new CounterThread("Thread 1");
      CounterThread thread2 = new CounterThread("Thread 2");
      
      thread1.start();
      thread2.start();
      
      try {
          thread1.join(); // Wait for thread1 to finish
          thread2.join(); // Wait for thread2 to finish
      } catch (InterruptedException e) {
          System.err.println("Main thread interrupted.");
      }

      System.out.println("Both threads have finished executing.");
  }
}
