package thread02;

import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2017/3/10.
 */
public class ThreadState  {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("-------"+Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("--------------");
                System.out.println(Thread.currentThread().getState());
            }
        }) ;
        System.out.println("-------------"+thread.getState());
        thread.start();

    }


}
