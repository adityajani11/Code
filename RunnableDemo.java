class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("run : " + i);
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable obj1 = new MyRunnable();
        Thread t1 = new Thread(obj1);
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main : " + i);
        }
    }
}