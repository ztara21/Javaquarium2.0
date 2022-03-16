package fr.ztara.javaquarium;

public class AlgaeCharacter {

    public int ID;
    public String NAME;
    public String TYPE;

    public void newCharacter() {
        System.out.println("Create new Algae Character");
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

    public String getAlgaeType() {
        return this.TYPE;
    }

    public void setAlgaeType(String TYPE) {
        this.TYPE = TYPE;
    }
}
