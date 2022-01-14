package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    GettingStarted g;

    @BeforeEach
    public void setUp() {
        g = new GettingStarted();
    }

    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    @Test
    public void addFiveToMinus1000() {
        int result = g.addFive(-1000);
        Assertions.assertEquals(-995,result);
    }

    @Test
    public void addFiveToMinusOne() {
        int result = g.addFive(-1);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void addFiveToMinusFive() {
        int result = g.addFive(-5);
        Assertions.assertEquals(0,result);
    }
}
