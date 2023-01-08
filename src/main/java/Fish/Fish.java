package Fish;

import Interfaces.ActionsInterface;

public class Fish implements ActionsInterface {
    public String getFishBreathe() {
        return "Breathing: Through the gills";
    }

    public String getFishMove() {
        return "Movement: In water";
    }

    public void animalBreathe() {
        System.out.println(getFishBreathe());
    }
    public void animalMove() {
        System.out.println(getFishMove());
    }
}