package BT_displaynumber;

public class TestThread {
    public static void main(String[] args) {
        Thread threadOdd = new OddThread();
        Thread threadEven = new EvenThread();

        try {
            threadOdd.start();
            threadOdd.join();
            threadEven.start();
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
    }
}
