package Fish;

import Interfaces.ActionsInterface;

public class Fish implements ActionsInterface {
    public void breathe() {
        System.out.println("Breathing: Through the gills");
    }
    public void move() {
        System.out.println("Movement: In water");
    }
}