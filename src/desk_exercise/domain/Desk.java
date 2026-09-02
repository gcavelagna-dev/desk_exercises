package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.*;

//testando alteração
public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers = 1;
//    String wood, String color, boolean hasDrawers)
    public Desk( ){
//        setColor(color);
//        setWood(wood);
//        setHasDrawers(hasDrawers);
//        if (hasDrawers) {
//            setDrawers(drawers);
//        } else {
//            drawers = 0;
//            setDrawers(drawers);
//        }
    }

    public void setWood(String wood) {
        if (wood.isEmpty() || wood.isBlank()) {
            throw new InvalidWoodException("Error: Invalid Wood.");
        }
        this.wood = wood;
    }

    public void setColor(String color) {
        if (color.isBlank() || color.isEmpty()) {
            throw new InvalidColorException("Error: Invalid Color");
        }
        this.color = color;
    }

    public void setHasDrawers(boolean hasDrawers) {
        this.hasDrawers = hasDrawers;
    }

    public void setDrawers(int drawers) {

        if (hasDrawers) {
            if (drawers < 0) {
                throw new InvalidNegativeDrawersException("Error: Negative Drawers.");
            }
            if (drawers > 12) {
                throw new InvalidSeveralDrawersException("Error: Max Drawers Hit.");
            }

            this.drawers = drawers;

        }
    }

    public String getWood() {
        return wood;
    }

    public String getColor() {
        return color;
    }

    public int getDrawers() {
        return drawers;
    }

    public boolean isHasDrawers() {
        return hasDrawers;
    }
}