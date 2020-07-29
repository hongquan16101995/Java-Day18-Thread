package BT_displaynumber;

public class OddThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
