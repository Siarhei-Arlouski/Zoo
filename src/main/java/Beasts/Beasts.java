package Beasts;

import Interfaces.ActionsInterface;

public class Beasts implements ActionsInterface {
    public String getBeastsBreathe() {
        return "Breathing: Through the nostrils";
    }

    public String getBeastsMove() {
        return "Movement: By land";
    }

    public void animalBreathe() {
        System.out.println(getBeastsBreathe());
    }
    public void animalMove() {
        System.out.println(getBeastsMove());
    }
}