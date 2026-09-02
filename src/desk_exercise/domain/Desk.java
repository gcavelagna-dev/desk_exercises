package poo.exercises.desk_exercise.domain;

import poo.exercises.desk_exercise.exception.*;

public class Desk {

    /***
     * @IloveJava
     */

    private String wood;
    private String color;
    private boolean hasDrawers;
    private int drawers = 0;

    public Desk() {
    }

/*
   toString serve para mostrar para java onde quer que o objeto em memória seja aplicado
   O arrayList acabou dando um caminho da memória no showTables
 */

    @Override
    public String toString() {
        return "Desk (" +
                "Wood: " + wood + " " +
                "| Color: " + color + " " +
                "| Drawers: " + drawers +
                ')';
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
                throw new InvalidNegativeNumberException("Error: Negative Drawers.");
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
