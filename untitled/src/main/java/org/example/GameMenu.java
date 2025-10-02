package org.example;

import java.util.Scanner;

public class GameMenu {
    private Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        boolean gameIsRunning = true;
        while (gameIsRunning == true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Venture in to the forest!");
            System.out.println("2. Go to the shop!");
            System.out.println("3. Fight Gul'Dan (level 10 required)");
            System.out.println("0. Abandon run.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                    //play / use 1 (venture)

                case 2:
                    break;
                    //shop

                case 3:
                    break;
                    //fight guldan (make lvl 10 req)
                case 0:
                    gameIsRunning = false;
                    break;

            }
        }
    }
}