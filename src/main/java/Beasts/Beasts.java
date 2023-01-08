package Beasts;

import Interfaces.ActionsInterface;

public class Beasts implements ActionsInterface {
    public void breathe() {
        System.out.println("Breathing: Through the nostrils");
    }
    public void move() {
        System.out.println("Movement: By land");
    }
}