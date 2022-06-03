import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {
    /**
     * Method under test: {@link SimpleCalculator#calculateTotal(CoinBundle)}
     */
    @Test
    void testCalculateTotal() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assertEquals(41, simpleCalculator.calculateTotal(new CoinBundle(1, 1, 1, 1)));
    }

    /**
     * Method under test: {@link SimpleCalculator#calculateTotal(CoinBundle)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCalculateTotal2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at SimpleCalculator.calculateTotal(SimpleCalculator.java:4)
        //   In order to prevent calculateTotal(CoinBundle)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   calculateTotal(CoinBundle).
        //   See https://diff.blue/R013 to resolve this issue.

        (new SimpleCalculator()).calculateTotal(null);
    }

    /**
     * Method under test: {@link SimpleCalculator#calculateChange(int)}
     */
    @Test
    void testCalculateChange() {
        CoinBundle actualCalculateChangeResult = (new SimpleCalculator()).calculateChange(10);
        assertEquals(0, actualCalculateChangeResult.number5CentsCoins);
        assertEquals(0, actualCalculateChangeResult.number25CentsCoins);
        assertEquals(0, actualCalculateChangeResult.number1CentsCoins);
        assertEquals(1, actualCalculateChangeResult.number10CentsCoins);
    }
}

