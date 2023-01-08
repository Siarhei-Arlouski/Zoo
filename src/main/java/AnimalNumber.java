public class AnimalNumber {
    public void animalNumber() {
        Animal dog = Animal.Dog;
        Animal lion = Animal.Lion;
        Animal eagle = Animal.Eagle;
        Animal colibri = Animal.Colibri;
        Animal archerFish = Animal.ArcherFish;
        Animal glowingFish = Animal.GlowingFish;

        System.out.println("List of animals:\n" + dog.getNumber() + ". " + dog.getAnimal() + "\n" +
                lion.getNumber() + ". " + lion.getAnimal() + "\n" +
                eagle.getNumber() + ". " + eagle.getAnimal() + "\n" +
                colibri.getNumber() + ". " + colibri.getAnimal() + "\n" +
                archerFish.getNumber() + ". " + archerFish.getAnimal() + "\n" +
                glowingFish.getNumber() + ". " + glowingFish.getAnimal() + "\n");
    }
}
