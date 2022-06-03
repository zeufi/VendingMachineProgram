import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CoinTest {
    /**
     * Method under test: {@link Coin#parseCoins(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testParseCoins() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Coins"
        //       at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        //       at java.lang.Integer.parseInt(Integer.java:652)
        //       at java.lang.Integer.parseInt(Integer.java:770)
        //       at Coin.parseCoins(Coin.java:17)
        //   In order to prevent parseCoins(String)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   parseCoins(String).
        //   See https://diff.blue/R013 to resolve this issue.

        Coin.parseCoins("Coins");
    }

    /**
     * Method under test: {@link Coin#parseCoins(String)}
     */
    @Test
    void testParseCoins2() {
        assertEquals(0, Coin.parseCoins(",").length);
    }

    /**
     * Method under test: {@link Coin#parseCoins(String)}
     */
    @Test
    void testParseCoins3() {
        int[] actualParseCoinsResult = Coin.parseCoins("42");
        assertEquals(1, actualParseCoinsResult.length);
        assertEquals(42, actualParseCoinsResult[0]);
    }

    /**
     * Method under test: {@link Coin#valueOf(String)}
     */
    @Test
    void testValueOf() {
        assertEquals(1, Coin.valueOf("ONE_CENTS").getValue());
    }
}

