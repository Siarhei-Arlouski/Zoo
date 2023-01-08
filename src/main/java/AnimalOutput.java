import Beasts.*;
import Birds.*;
import Fish.*;

public class AnimalOutput {
    public void animalOutput(int number) {
        switch (number) {
            case 1 -> {
                System.out.println("Dog");
                Dog dog = new Dog();
                dog.animalBreathe();
                dog.animalMove();
                dog.dogSmell();
            }
            case 2 -> {
                System.out.println("Lion");
                Lion lion = new Lion();
                lion.animalBreathe();
                lion.animalMove();
                lion.lionRoar();
            }
            case 3 -> {
                System.out.println("Eagle");
                Eagle eagle = new Eagle();
                eagle.animalBreathe();
                eagle.animalMove();
                eagle.eagleAcuteEyesight();
            }
            case 4 -> {
                System.out.println("Colibri");
                Colibri colibri = new Colibri();
                colibri.animalBreathe();
                colibri.animalMove();
                colibri.colibriMobility();
            }
            case 5 -> {
                System.out.println("Archer Fish");
                ArcherFish archerFish = new ArcherFish();
                archerFish.animalBreathe();
                archerFish.animalMove();
                archerFish.archerFishSpittingTechnique();
            }
            case 6 -> {
                System.out.println("Glowing Fish");
                GlowingFish glowingFish = new GlowingFish();
                glowingFish.animalBreathe();
                glowingFish.animalMove();
                glowingFish.glowingFishGlow();
            }
            default -> System.out.println("Incorrect number");
        }
    }
}