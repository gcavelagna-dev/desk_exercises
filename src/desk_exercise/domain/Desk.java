package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.InvalidColorException;
import poo.exercises.desk_exercise.exception.InvalidDrawersException;
import poo.exercises.desk_exercise.exception.InvalidWoodException;

public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers;

    public Desk(String wood, String color, boolean hasDrawers, int drawers) {
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
        if (hasDrawers){
            if (drawers < 1 ){
                throw new InvalidDrawersException("Error: Negative Drawers.");
            }
            this.drawers = drawers;
        }
        //sei que aqui não deve fazer muito sentido, mas irei deixar.
        if (hasDrawers) {
            return;
        }
        return;
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
}