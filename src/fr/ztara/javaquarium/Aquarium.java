package fr.ztara.javaquarium;

import java.util.ArrayList;

public class Aquarium {

    public static ArrayList<Fish[]> fishList = new ArrayList<Fish[]>();
    public static ArrayList<Algae[]> algaeList = new ArrayList<Algae[]>();

    public int auqariumID;
    public int fishCapacity;

    public Aquarium(int aquariumID, int fishCapacity) {
        this.auqariumID = aquariumID;
        this.fishCapacity = fishCapacity;
    }

    public void registerFish(Fish ...fish) {
        fishList.add(fish);
    }
    public void registerAlgae(Algae ...algae) {
        algaeList.add(algae);
    }

    public int getFishCapacity() {
        return fishCapacity;
    }

    public int getAuqariumID() {
        return auqariumID;
    }
}
