package Birds;

import Interfaces.ActionsInterface;

public class Birds implements ActionsInterface {
    public void breathe() {
        System.out.println("Breathing: Through the nostrils");
    }
    public void move() {
        System.out.println("Movement: Flights");
    }
}