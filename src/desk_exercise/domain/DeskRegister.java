package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidAddDeskNullException;
import poo.exercises.desk_exercise.exception.InvallidDuplicateDeskException;

import java.util.ArrayList;

public class DeskRegister {

    private ArrayList<Desk> desks;

    public DeskRegister() {
        this.desks = new ArrayList<>();
    }

    public void addDesk(Desk desk) {

        if (desk == null) {
            throw new InvalidAddDeskNullException("Error: Addition of a Null Desk.");
        }
        if (desks.contains(desk)) {
            throw new InvallidDuplicateDeskException("Error: Duplicate Desks.");
        }

        desks.add(desk);
    }

    public void showTables(ArrayList<Desk> desks) {
        for (int i = 0; i < desks.size(); i++) {
            System.out.println((i + 1) + " - " + desks.get(i));
        }
    }

    public void removeDesk(Desk desk) {
        desks.remove(desk);
    }

    public ArrayList<Desk> getDesks() {
        return new ArrayList<>(this.desks);
    }

}
