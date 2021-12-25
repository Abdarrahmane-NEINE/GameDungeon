package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        System.out.println("Welcome to this Dungeon adventure Game\n" +
                "If your hero is able to go through all 5 rooms of this dungeon\n" +
                "he will penetrate in the dragon's lair where his final " +
                "enemy will be waiting for him\n" +
                "\t- If he defeats it, he will be rich beyond his wildest dream,\n" +
                "\t- If he does not, his bones will joins those of " +
                "all the previous adventurer foolish " +
                "enough to have penetrate this place");



        //Main object instanciation, hero and dungeon
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your heros' name : ");
        String herosName = scanner.nextLine();
        Hero conan = new Hero(herosName, 100);
        Dungeon naheulbeuk = new Dungeon();

        System.out.println("Let the adventure begin");
        naheulbeuk.admit(conan);

    }
}
