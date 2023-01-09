import static org.junit.jupiter.api.Assertions.*;

import Enums.ChristmasBallColor;
import Exception.ChristmasBallException;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;


class ChristmasBallTest {

    @Test
    @Description("Test: if an exception is thrown whenever a christmasball has a diameter that is bigger then 30cm")
    void christmasBallExceptionTest() {
        assertThrowsExactly(ChristmasBallException.class, () -> {
            new ChristmasBall(31, ChristmasBallColor.BLUE, "An amazing blue christmas ball");
        });
        assertThrowsExactly(ChristmasBallException.class, () -> {
            new ChristmasBall(32, ChristmasBallColor.RED, "An amazing red christmas ball");
        });
    }

    @Test
    @Description("Test: if an exception is not thrown whenever a christmasball has a diameter that is smaller or equal to 30cm")
    void noChristmasBallExceptionTest() {
        assertDoesNotThrow(() -> {
            new ChristmasBall(30, ChristmasBallColor.GOLD, "A big gold Christmas ball");
        });
        assertDoesNotThrow(() -> {
            new ChristmasBall(30, ChristmasBallColor.RED, "A big gold Christmas ball");
        });
    }
}