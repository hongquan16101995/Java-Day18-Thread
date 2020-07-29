package BT_thread;

public class NumberGenerator implements Runnable{
    @Override
    synchronized public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            System.out.println(hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
