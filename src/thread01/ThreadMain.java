package thread01;

/**
 * Created by Administrator on 2017/3/3.
 */
public class ThreadMain {
    public static void main(String[] args) {
        // 启动3个线程t1,t2,t3；每个线程各卖10张票！
//        MyThread1 thread1 = new MyThread1();
//        MyThread1 thread11 = new MyThread1();
//        MyThread1 thread111 = new MyThread1();
//        thread1.start();
//        thread11.start();
//        thread111.start();

        System.out.println("------------------------");
// 启动3个线程t1,t2,t3(它们共用一个Runnable对象)，这3个线程一共卖10张票！
        MyRunnable myThread2 = new MyRunnable();
        Thread thread2 = new Thread(myThread2);
        Thread thread22 = new Thread(myThread2);
        Thread thread222 = new Thread(myThread2);

        thread2.start();
        thread22.start();
        thread222.start();
    }
}
