package Beasts;

public class Dog extends Beasts {

    public String getDogSmell() {
        return "Unique action: Smell";
    }

    public void dogSmell() {
        System.out.println(getDogSmell());
    }
}