import Beasts.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BeastsTest {
    Beasts beasts = new Beasts();
    Dog dog = new Dog();
    Lion lion = new Lion();

    @Test(groups = "positive")
    public void beastsBreathePositiveTest() {
        Assert.assertEquals(beasts.getBeastsBreathe(), "Breathing: Through the nostrils");
    }

    @Test(groups = "positive")
    public void beastsMovePositiveTest() {
        Assert.assertEquals(beasts.getBeastsMove(), "Movement: By land");
    }

    @Test(groups = "positive")
    public void dogSmellPositiveTest() {
        Assert.assertEquals(dog.getDogSmell(), "Unique action: Smell");
    }

    @Test(groups = "positive")
    public void lionRoarPositiveTest() {
        Assert.assertEquals(lion.getLionRoar(), "Unique action: Roar");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void beastsBreatheNegativeTest() {
        Assert.assertEquals(beasts.getBeastsBreathe(), "Breathing: Through the gills");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void beastsMoveNegativeTest() {
        Assert.assertEquals(beasts.getBeastsMove(), "Movement: In water");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void dogSmellNegativeTest() {
        Assert.assertEquals(dog.getDogSmell(), "Unique action: Roar");
    }

    @Test(groups = "negative", expectedExceptions = AssertionError.class)
    public void lionRoarNegativeTest() {
        Assert.assertEquals(lion.getLionRoar(), "Unique action: Smell");
    }
}
