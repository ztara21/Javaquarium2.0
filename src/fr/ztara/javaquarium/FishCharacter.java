package fr.ztara.javaquarium;

import java.awt.*;

public class FishCharacter {

    public int ID;
    public String NAME;
    public Color FISH_COLOR;

    public void newCharacter() {
        System.out.println("Create new Fish Character");
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Color getFishColor() {
        return this.FISH_COLOR;
    }

    public void setFishColor(Color fishColor) {
        this.FISH_COLOR = fishColor;
    }
}
