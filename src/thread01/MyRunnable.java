package thread01;

/**
 * Created by Administrator on 2017/3/3.
 */
public class MyRunnable implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(this.ticket > 0){
                System.out.println(Thread.currentThread().getName()+" 卖票:ticket "+this.ticket--);
            }
        }

    }
}
