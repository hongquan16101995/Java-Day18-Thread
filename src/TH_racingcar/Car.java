package TH_racingcar;

import java.util.Random;

public class Car implements Runnable{
    private String name;
    private int DISTANCE = Main.DISTANCE;
    private int STEP = Main.STEP;

    public Car(String name) {
        this.name = name;
    }

    @Override
    synchronized public void run() {
        int runDistance = 0;
        long timeStart = System.currentTimeMillis();
        while (runDistance < DISTANCE){
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log = "|";
                for (int i = 0; i < DISTANCE; i += STEP){
                    if(runDistance >= i + STEP){
                        log += "=";
                    }else if(runDistance >= i && runDistance < i + STEP){
                        log += "o";
                    }else
                        log += "-";
                }
                log += "|";
                System.out.println("Car " + this.name + " : " + log + " " + Math.min(DISTANCE, runDistance) + " KM");
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
        long timeStop = System.currentTimeMillis();
        System.out.println("Car " + this.name + " Finish in " + (timeStop-timeStart)/1000 + "s");
    }
}
