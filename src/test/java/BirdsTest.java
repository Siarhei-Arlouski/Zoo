import Birds.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdsTest {
    Birds birds = new Birds();
    Colibri colibri = new Colibri();
    Eagle eagle = new Eagle();

    @Test(groups = "positive")
    public void birdsBreathePositiveTest() {
        Assert.assertEquals(birds.getBirdsBreathe(), "Breathing: Through the nostrils");
    }

    @Test(groups = "positive")
    public void birdsMovePositiveTest() {
        Assert.assertEquals(birds.getBirdsMove(), "Movement: Flights");
    }

    @Test(groups = "positive")
    public void colibriMobilityPositiveTest() {
        Assert.assertEquals(colibri.getColibriMobility(), "Unique action: Mobility");
    }

    @Test(groups = "positive")
    public void eagleAcuteEyesightPositiveTest() {
        Assert.assertEquals(eagle.getEagleAcuteEyesight(), "Unique action: Acute eyesight");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void birdsBreatheNegativeTest() {
        Assert.assertEquals(birds.getBirdsBreathe(), "Breathing: Through the gills");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void birdsMoveNegativeTest() {
        Assert.assertEquals(birds.getBirdsMove(), "Movement: In water");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void colibriMobilityNegativeTest() {
        Assert.assertEquals(colibri.getColibriMobility(), "Unique action: Roar");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void eagleAcuteEyesightNegativeTest() {
        Assert.assertEquals(eagle.getEagleAcuteEyesight(), "Unique action: Smell");
    }
}
