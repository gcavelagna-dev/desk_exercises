package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidDrawersException;
import poo.exercises.desk_exercise.exception.InvalidNegativeDrawersException;
import poo.exercises.desk_exercise.exception.InvalidWoodException;

public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers;

    public Desk(String wood, String color) {
        setColor(color);
        setWood(wood);
        setHasDrawers(hasDrawers);
        setDrawers(drawers);
    }

    public void setWood(String wood) {
        if (wood.isEmpty() || wood.isBlank()){
            throw new InvalidWoodException("Error: Invallid Wood.");
        }
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
            if (drawers < 1 ){
                throw new InvalidNegativeDrawersException("Error: Negative Drawers.");
            }
            this.drawers = drawers;
        }
        throw new InvalidDrawersException("Error: Invallid Drawers");
    }
}