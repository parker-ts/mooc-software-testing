package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    @Test
    public void addFiveToMinus1000() {
        int result = new GettingStarted().addFive(-1000);
        Assertions.assertEquals(-995,result);
    }

    @Test
    public void addFiveToMinusOne() {
        int result = new GettingStarted().addFive(-1);
        Assertions.assertEquals(4,result);
    }

    @Test
    public void addFiveToMinusFive() {
        int result = new GettingStarted().addFive(-5);
        Assertions.assertEquals(0,result);
    }
}
