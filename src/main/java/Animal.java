public enum Animal {
    Dog(1, "Dog"),
    Lion(2, "Lion"),
    Eagle (3, "Eagle"),
    Colibri (4,"Colibri"),
    ArcherFish (5, "ArcherFish"),
    GlowingFish (6, "GlowingFish");

    private final int number;
    private final String animal;

    Animal(int number, String animal) {
        this.number = number;
        this.animal = animal;
    }

    public int getNumber() {
        return number;
    }

    public String getAnimal() {
        return animal;
    }
}