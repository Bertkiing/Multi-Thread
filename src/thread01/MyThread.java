package thread01;

/**
 * Created by Administrator on 2017/3/3.
 */
public class MyThread extends Thread {
    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName()+"卖票：ticket"+this.ticket--);
        }
    }
}
