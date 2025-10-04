package org.example.Menu;

public interface Helper {
    static int randomInt(int min, int max) {
        return (int) Math.round(Math.random() * (max - min + 1) + min); // max - min + 1 == största värdet minus minsta + 1 för att se till att det är största. (denna googlade jag :))
    }
} // Kunde ha gjort en sån där timer vi gjorde på podracern här och implementera den i alla menyer / battles men hade inte tid :(.

