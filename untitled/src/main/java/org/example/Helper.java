package org.example;

public interface Helper {
    static int randomInt(int min, int max){
        return (int) Math.round(Math.random() * (max - min + 1) + min); // max - min + 1 == största värdet minus minsta + 1 för att se till att det är största. (denna googlade jag :))
    }

    static void sleepForMilliSeconds(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            e.printStackTrace();  // vi hanterar eventuella avbrott
        }
    }
}

