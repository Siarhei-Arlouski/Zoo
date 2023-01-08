import Beasts.*;
import Birds.*;
import Fish.*;

import java.util.Scanner;

public class AnimalOutput {
    public void animalOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println("Dog");
                Dog dog = new Dog();
                dog.breathe();
                dog.move();
                dog.smell();
            }
            case 2 -> {
                System.out.println("Lion");
                Lion lion = new Lion();
                lion.breathe();
                lion.move();
                lion.roar();
            }
            case 3 -> {
                System.out.println("Eagle");
                Eagle eagle = new Eagle();
                eagle.breathe();
                eagle.move();
                eagle.acuteEyesight();
            }
            case 4 -> {
                System.out.println("Colibri");
                Colibri colibri = new Colibri();
                colibri.breathe();
                colibri.move();
                colibri.smallSize();
            }
            case 5 -> {
                System.out.println("Archer Fish");
                ArcherFish archerFish = new ArcherFish();
                archerFish.breathe();
                archerFish.move();
                archerFish.spittingTechnique();
            }
            case 6 -> {
                System.out.println("Glowing Fish");
                GlowingFish glowingFish = new GlowingFish();
                glowingFish.breathe();
                glowingFish.move();
                glowingFish.glow();
            }
            default -> System.out.println("Incorrect number");
        }
    }
}