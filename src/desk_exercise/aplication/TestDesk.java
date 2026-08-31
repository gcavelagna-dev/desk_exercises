package poo.exercises.desk_exercise.aplication;

import poo.exercises.desk_exercise.domain.Desk;

public class TestDesk {

    public static void main(String[] args){
        Desk desk = new Desk("Oak", "Orange", false);

        desk.setDrawers(20);
        System.out.println(desk.getDrawers());
    }
}
