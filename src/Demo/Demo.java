package Demo;

public class Demo {
    public static void main(String[] args) {
        Table table = new Table();

        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();
    }
}

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i < 6; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}


class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
