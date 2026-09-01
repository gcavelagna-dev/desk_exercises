package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidAddDeskNullException;
import poo.exercises.desk_exercise.exception.InvallidDuplicateDeskException;

import java.util.ArrayList;

public class DeskRegister {

    private final ArrayList<Desk> tableRegistrations = new ArrayList<>();

    public void addDesk(Desk desk){

        if (desk == null){
            throw new InvalidAddDeskNullException("Error: Addition of a Null Desk.");
        }
        if (tableRegistrations.contains(desk)){
            throw new InvallidDuplicateDeskException("Error: Duplicate Desks.");
        }

        tableRegistrations.add(desk);
    }

    public void showTables(ArrayList<Desk> desks){
        for (int i = 0; i < tableRegistrations.size(); i++) {
            tableRegistrations.get(i);
        }

    }
    public void removeDesk(Desk desk){
        tableRegistrations.remove(desk);
    }

    public ArrayList<Desk> getTableRegistrations(){
        return new ArrayList<>(this.tableRegistrations);
    }

}
