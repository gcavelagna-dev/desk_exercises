package poo.exercises.desk_exercise.aplication;

import poo.exercises.desk_exercise.domain.Desk;
import poo.exercises.desk_exercise.domain.DeskRegister;


import java.util.Scanner;

public class TestDesks {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int amount = 0;

        while (true){
            System.out.println("How many tables will you have");

            try {
                amount = input.nextInt();
                if (amount < 1 || amount > 5){
                    System.err.println("\nInvalid Number..\n");
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                System.err.println("\nUnidentified Number.\n");
                input.next();
                continue;
            }
        }
        System.out.println("----------------------------");
        input.nextLine();
        boolean hasDrawer;
        for (int i = 0; i < amount; i++) {
            System.out.println("\nWhat kind of wood is the table made of?");
            String wood = input.nextLine();

            System.out.println("\nWhat is the color?");
            String color = input.nextLine();

            while (true){
                System.out.println("\nDoes the desk have drawers?[Y/N]");
                String response = input.next();


                if (response.equalsIgnoreCase("Y")){
                    hasDrawer = true;
                    break;
                } else if (response.equalsIgnoreCase("N")){
                    hasDrawer = false;
                    break;
                }else {
                    System.err.println("\nUnidentified responses ");
                    input.next();
                    continue;
                }
            }

            if (hasDrawer){
                System.out.println("\n");
            }

        }
        Desk oak = new Desk("Oak", "Orange", true);
        Desk pine = new Desk("Pine", "Pink", false);
        Desk ash = new Desk("Ash", "Brown", false);

        DeskRegister deskRegister = new DeskRegister();

        deskRegister.addDesk(oak);
        deskRegister.addDesk(pine);
        deskRegister.addDesk(ash);

        System.out.println("\n----------------------------\n");


        //                  testar o showTables                \\


//        deskRegister.showTables(deskRegister.showTables());
        System.out.println("\n----------------------------\n");



    }
}
