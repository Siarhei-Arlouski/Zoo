package Fish;

public class GlowingFish extends Fish {
    public String getGlowingFishGlow() {
        return "Unique action: Glow";
    }

    public void glowingFishGlow() {
        System.out.println(getGlowingFishGlow());
    }
}