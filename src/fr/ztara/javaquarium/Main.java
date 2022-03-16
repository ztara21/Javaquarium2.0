package fr.ztara.javaquarium;

import java.awt.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String username = "user" + new Random().nextInt(1, 100);

    public static Aquarium aquaBocal = new Aquarium(1, 10);

    public static Fish goldenFish = new Fish();
    public static Algae agare_agare = new Algae();

    public static void main(String[] args) {
        init();
        register(aquaBocal, agare_agare, goldenFish);
        System.out.println("Hey, type '!help' to get action commands list.");
        actions();
    }

    public static void init() {
        goldenFish.setNAME("GoldenFish");
        goldenFish.setID(1);
        goldenFish.setFishColor(Color.ORANGE);

        agare_agare.setNAME("Agare Agare");
        agare_agare.setID(1);
        agare_agare.setAlgaeType("AGARE_AGARE");
    }

    public static void register(Aquarium aquarium, Algae newAlgae, Fish... newFish) {
        aquarium.registerAlgae(newAlgae);
        aquarium.registerFish(newFish);
    }

    public static void actions() {
        Scanner input = new Scanner(System.in);

        String command = input.nextLine();

        if (command.startsWith("!")) {
            if(command.equalsIgnoreCase("!help")) {
                System.out.println("ALL AVAILABLE COMMANDS: ");
                System.out.println("   -> !content: List all fishes and algae");
                System.out.println("   -> !capacity: Get capacity available");
                actions();
            } else if(command.equalsIgnoreCase("!capacity")) {
                System.out.println("AQUARIUM CAPACITY: " + aquaBocal.getFishCapacity());

            }
            else {
                System.out.println("Unknown Command, type '#help' to get a list of all available commands.");
                actions();
            }
        } else {
            System.out.println(username + ": " + command);
            actions();
        }

        // System.out.println("FISH n°" + goldenFish.getID() + ": NAME = " + goldenFish.getNAME() + ", COLOR = " + String.valueOf(goldenFish.getFishColor()));
        // System.out.println("ALGAE n°" + agare_agare.getID() + ": NAME = " + agare_agare.getNAME() + ", TYPE = " + agare_agare.getAlgaeType());
    }

}
