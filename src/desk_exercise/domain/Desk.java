package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidColorException;
import poo.exercises.desk_exercise.exception.InvalidDrawersException;
import poo.exercises.desk_exercise.exception.InvalidNegativeDrawersException;
import poo.exercises.desk_exercise.exception.InvalidWoodException;

public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers;

    public Desk(String wood, String color, boolean hasDrawers) {
        setColor(color);
        setWood(wood);
        setHasDrawers(hasDrawers);
        setDrawers(drawers);
    }

    public void setWood(String wood) {
        if (wood.isEmpty() || wood.isBlank()){
            throw new InvalidWoodException("Error: Invalid Wood.");
        }
        this.wood = wood;
    }

    public void setColor(String color) {
        if (color.isBlank() || color.isEmpty()){
            throw new InvalidColorException("Error: Invalid Color");
        }
        this.color = color;
    }

    public void setHasDrawers(boolean hasDrawers) {
        this.hasDrawers = hasDrawers;
    }

    public void setDrawers(int drawers) {
        if (!hasDrawers){
            throw new InvalidDrawersException("Error: There are no Drawers.");
        }
        if (hasDrawers){
            if (drawers < 1 ){
                throw new InvalidNegativeDrawersException("Error: Negative Drawers.");
            }
            System.out.println("Drawers successfully set to " + drawers);
            this.drawers = drawers;
        }

    }

    public String getWood(){
        return wood;
    }

    public String getColor(){
        return color;
    }
    public int getDrawers(){
        return drawers;
    }
    public boolean isHasDrawers(){
        return hasDrawers;
    }
}