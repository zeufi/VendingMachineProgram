import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class VendingMachineRequestTest {
    /**
     * Method under test: default or parameterless constructor of {@link VendingMachineRequest}
     */
    @Test
    void testConstructor() {
        VendingMachineRequest actualVendingMachineRequest = new VendingMachineRequest(1, 1, 1, 1, 1);

        assertEquals(Product.Water, actualVendingMachineRequest.product);
        CoinBundle coinBundle = actualVendingMachineRequest.enteredCoins;
        assertEquals(1, coinBundle.number5CentsCoins);
        assertEquals(1, coinBundle.number25CentsCoins);
        assertEquals(1, coinBundle.number1CentsCoins);
        assertEquals(1, coinBundle.number10CentsCoins);
    }

    /**
     * Method under test: default or parameterless constructor of {@link VendingMachineRequest}
     */
    @Test
    void testConstructor2() {
        VendingMachineRequest actualVendingMachineRequest = new VendingMachineRequest(0, 1, 1, 1, 1);

        assertEquals(Product.EMPTY, actualVendingMachineRequest.product);
        CoinBundle coinBundle = actualVendingMachineRequest.enteredCoins;
        assertEquals(1, coinBundle.number5CentsCoins);
        assertEquals(1, coinBundle.number25CentsCoins);
        assertEquals(1, coinBundle.number1CentsCoins);
        assertEquals(1, coinBundle.number10CentsCoins);
    }

    /**
     * Method under test: default or parameterless constructor of {@link VendingMachineRequest}
     */
    @Test
    void testConstructor3() {
        VendingMachineRequest actualVendingMachineRequest = new VendingMachineRequest(-1, 1, 1, 1, 1);

        assertEquals(Product.EMPTY, actualVendingMachineRequest.product);
        CoinBundle coinBundle = actualVendingMachineRequest.enteredCoins;
        assertEquals(1, coinBundle.number5CentsCoins);
        assertEquals(1, coinBundle.number25CentsCoins);
        assertEquals(1, coinBundle.number1CentsCoins);
        assertEquals(1, coinBundle.number10CentsCoins);
    }

    /**
     * Method under test: default or parameterless constructor of {@link VendingMachineRequest}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at CoinBundle.<init>(CoinBundle.java:8)
        //       at VendingMachineRequest.<init>(VendingMachineRequest.java:8)
        //   In order to prevent <init>(int, int[])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(int, int[]).
        //   See https://diff.blue/R013 to resolve this issue.

        new VendingMachineRequest(1);

    }
}

