package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvallidDrawersException;

public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers;

    public Desk(String wood, String color) {
        setColor(color);
        setWood(wood);
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasDrawers(boolean hasDrawers) {
        this.hasDrawers = hasDrawers;
    }

    public void setDrawers(int drawers) {
        if (hasDrawers){
            this.drawers = drawers;
        }
        throw new InvallidDrawersException("Error: Invallid Drawers");
    }
}