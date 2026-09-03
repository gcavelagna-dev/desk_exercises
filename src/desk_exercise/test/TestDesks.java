package poo.exercises.desk_exercise.test;

import poo.exercises.desk_exercise.domain.Desk;
import poo.exercises.desk_exercise.domain.DeskRegister;
import poo.exercises.desk_exercise.exception.DeskException;

import java.util.Scanner;

public class TestDesks {

    /***
     * @IloveJava
     * tests to see results
     * @IloveJava
     */

    public static void main(String[] args) {

        DeskRegister deskRegister = new DeskRegister();

        Scanner input = new Scanner(System.in);
        int amount = 0;

        while (true) {
            System.out.println("How many tables will you have?[Max: 5]");

            try {
                amount = input.nextInt();
                if (amount < 1 || amount > 5) {
                    System.err.println("\nInvalid Number..\n");
                    continue;
                }
                break;
            } catch (DeskException e) {
                System.err.println(e.getMessage());
                input.next();
                continue;
            }
        }

        System.out.println("----------------------------");

        for (int i = 0; i < amount; i++) {

            Desk desk = new Desk();
            String wood;
            String color;
            String response;
            boolean hasDrawer;
            int drawers = 0;

            System.out.println("\nWhat kind of wood is the table made of?");
            input.nextLine();
            wood = input.nextLine();
            desk.setWood(wood);

            System.out.println("\nWhat is the color?");
            color = input.nextLine();
            desk.setColor(color);

            while (true) {
                System.out.println("\nDoes the desk have drawers?[Y/N]");
                response = input.next();


                if (response.equalsIgnoreCase("Y")) {
                    hasDrawer = true;
                    desk.setHasDrawers(hasDrawer);
                    break;
                } else if (response.equalsIgnoreCase("N")) {
                    desk.setHasDrawers(false);
                    hasDrawer = false;
                    break;
                } else {
                    System.err.println("\nUnidentified responses ");
                    input.next();
                    continue;
                }

            }

            while (hasDrawer) {

                System.out.println("\nHow many drawers does this desk have?\n");
                try {
                    drawers = input.nextInt();
                    desk.setDrawers(drawers);
                    break;
                } catch (DeskException e) {
                    System.err.println("Unidentified Number.");
                    input.next();
                    continue;
                }
            }

            deskRegister.addDesk(desk);
        }

        System.out.println("\n----------------------------\n");

        deskRegister.showTables();

        System.out.println("----------------------------");

    }
}
