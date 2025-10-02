package org.example;

import org.example.Characters.*;
import org.example.Menu.GameMenu;
import org.example.Weapons.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero bertil = new Hero("Bertil",100);
        GameMenu game = new GameMenu(bertil);
        game.showMainMenu();
    }
}

