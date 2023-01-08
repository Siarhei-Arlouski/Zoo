package Fish;

public class ArcherFish extends Fish {
    public String getArcherFishSpittingTechnique() {
        return "Unique action: Spitting technique";
    }

    public void archerFishSpittingTechnique() {
        System.out.println(getArcherFishSpittingTechnique());
    }
}