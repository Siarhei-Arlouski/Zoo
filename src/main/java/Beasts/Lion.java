package Beasts;

public class Lion extends Beasts {
    public String getLionRoar() {
        return "Unique action: Roar";
    }

    public void lionRoar() {
        System.out.println(getLionRoar());
    }
}