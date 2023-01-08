import Fish.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FishTest {
    Fish fish = new Fish();
    ArcherFish archerFish = new ArcherFish();
    GlowingFish glowingFish = new GlowingFish();

    @Test(groups = "positive")
    public void fishBreathePositiveTest() {
        Assert.assertEquals(fish.getFishBreathe(), "Breathing: Through the gills");
    }

    @Test(groups = "positive")
    public void fishMovePositiveTest() {
        Assert.assertEquals(fish.getFishMove(), "Movement: In water");
    }

    @Test(groups = "positive")
    public void archerFishSpittingTechniquePositiveTest() {
        Assert.assertEquals(archerFish.getArcherFishSpittingTechnique(), "Unique action: Spitting technique");
    }

    @Test(groups = "positive")
    public void glowingFishGlowPositiveTest() {
        Assert.assertEquals(glowingFish.getGlowingFishGlow(), "Unique action: Glow");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void fishBreatheNegativeTest() {
        Assert.assertEquals(fish.getFishBreathe(), "Breathing: Through the nostrils");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void fishMoveNegativeTest() {
        Assert.assertEquals(fish.getFishMove(), "Movement: Flights");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void archerFishSpittingTechniqueNegativeTest() {
        Assert.assertEquals(archerFish.getArcherFishSpittingTechnique(), "Unique action: Roar");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void glowingFishGlowNegativeTest() {
        Assert.assertEquals(glowingFish.getGlowingFishGlow(), "Unique action: Smell");
    }
}
