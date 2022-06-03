import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CoinBundleTest {
    /**
     * Method under test: default or parameterless constructor of {@link CoinBundle}
     */
    @Test
    void testConstructor() {
        CoinBundle actualCoinBundle = new CoinBundle(1, 1, 1, 1);
        assertEquals(1, actualCoinBundle.number5CentsCoins);
        assertEquals(1, actualCoinBundle.number25CentsCoins);
        assertEquals(1, actualCoinBundle.number1CentsCoins);
        assertEquals(1, actualCoinBundle.number10CentsCoins);
    }

    /**
     * Method under test: default or parameterless constructor of {@link CoinBundle}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at CoinBundle.<init>(CoinBundle.java:8)
        //   In order to prevent <init>(int[])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(int[]).
        //   See https://diff.blue/R013 to resolve this issue.

        new CoinBundle();
    }

    /**
     * Method under test: {@link CoinBundle#getTotal()}
     */
    @Test
    void testGetTotal() {
        assertEquals(41, (new CoinBundle(1, 1, 1, 1)).getTotal());
    }
}

