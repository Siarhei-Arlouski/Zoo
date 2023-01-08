package Birds;

import Interfaces.ActionsInterface;

public class Birds implements ActionsInterface {
    public String getBirdsBreathe() {
        return "Breathing: Through the nostrils";
    }

    public String getBirdsMove() {
        return "Movement: Flights";
    }

    public void animalBreathe() {
        System.out.println(getBirdsBreathe());
    }
    public void animalMove() {
        System.out.println(getBirdsMove());
    }
}