package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.*;

public class Desk {

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers = 0;

    public Desk() {
    }

    @Override
    public String toString() {
        return "\n" + "Desk (" +
                "Wood: " + wood + " " +
                "| Color: " + color + " " +
                "| Drawers: " + drawers +
                ')' + "\n";
    }

    public void setWood(String wood) {
        if (wood.isBlank()) {
            throw new InvalidWoodException("Error: Invalid Wood.");
        }
        this.wood = wood;

    }

    public void setColor(String color) {
        if (color.isBlank()) {
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
                throw new InvalidNegativeNumberException("Error: Negative Drawers.");
            }
            if (drawers > 12) {
                throw new InvalidSeveralDrawersException("Error: Max Drawers Hit.\n");
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
