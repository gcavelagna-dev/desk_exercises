package poo.exercises.desk_exercise.aplication;

import poo.exercises.desk_exercise.domain.Desk;
import poo.exercises.desk_exercise.domain.DeskRegister;
import poo.exercises.desk_exercise.exception.DeskException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DeskRegister deskRegister = new DeskRegister();

        System.out.println("Welcome to my table CRUD.");
        boolean system = true;
        while (system) {


            System.out.println("""
                    \n=================================
                             DESK SYSTEM
                    =================================
                    \n1 - Register desk
                    2 - Show desks
                    3 - Remove desk
                    4 - Exit
                    \nChoose one:
                    """);

            Desk desk = new Desk();
            String wood;
            String color;
            String response;
            boolean hasDrawer;
            int drawers = 0;

            int option = input.nextInt();
            switch (option) {

                case 1:

                    boolean register = true;

                    while (register) {
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
                                desk.setHasDrawers(true);
                                break;
                            } else if (response.equalsIgnoreCase("N")) {
                                hasDrawer = false;
                                desk.setHasDrawers(false);
                                register = false;
                                break;
                            } else {
                                System.err.println("\nUnidentified responses.");
                                input.next();
                                continue;
                            }

                        }

                        while (hasDrawer) {

                            System.out.println("\nHow many drawers does this desk have?\n");
                            try {
                                drawers = input.nextInt();
                                desk.setDrawers(drawers);
                                register = false;
                                break;
                            } catch (DeskException e) {
                                System.err.println(e.getMessage());
                                input.next();
                                continue;
                            }
                        }

                        deskRegister.addDesk(desk);
                        break;
                    }
                    break;
                case 2:
                    deskRegister.showTables();
                    break;
                case 3:

                    deskRegister.showTables();

                    boolean running = true;
                    while (running) {

                        System.out.println("Which table do you want to remove?[by the index]");
                        try {
                            int index = input.nextInt();
                            deskRegister.removeDesk(index);
                        }catch (DeskException e){
                            System.out.println(e.getMessage());

                        }

                        running = false;
                    }

                    break;
                case 4:
                    System.err.println("\nLogging out of the system...\n");
                    system = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }

    }

}


