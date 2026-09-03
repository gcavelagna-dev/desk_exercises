package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidAddDeskNullException;
import poo.exercises.desk_exercise.exception.InvalidIndexNumberException;
import poo.exercises.desk_exercise.exception.InvalidRemoveDeskException;

import java.util.ArrayList;

public class DeskRegister {

    private final ArrayList<Desk> desks;

    public DeskRegister() {
        this.desks = new ArrayList<>();
    }

    public void addDesk(Desk desk) {

        if (desk == null) {
            throw new InvalidAddDeskNullException("Error: Addition of a Null Desk.");
        }

        desks.add(desk);
    }

    public void showTables() {

        String error = "\nThe list is empty.\n";
        if (desks.isEmpty()) {
            System.err.println(error);
            return;
        }
        for (int i = 0; i < desks.size(); i++) {
            System.out.println((i + 1) + " - " + desks.get(i));
        }
    }

    public void removeDesk(int index) {

        String error = "\nThe list is empty.\n";
        if (desks.isEmpty()) {
            System.err.println(error);
            return;
        }

        if (index >= 0 && index < desks.size()) {
            desks.remove(index);
        } else if (index > desks.size() || index < desks.size()) {
            throw new InvalidIndexNumberException("Error: Invalid Number.");
        } else {
            throw new InvalidRemoveDeskException("Error: Invalid Remove Desk.");
        }

    }

    public ArrayList<Desk> getDesks() {
        return new ArrayList<>(this.desks);
    }

}
