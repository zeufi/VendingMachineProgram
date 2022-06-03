import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SimpleVendingMachineControllerTest {
    /**
     * Method under test: {@link SimpleVendingMachineController#calculateChange(VendingMachineRequest)}
     */
    @Test
    void testCalculateChange() {
        SimpleVendingMachineController simpleVendingMachineController = new SimpleVendingMachineController();
        CoinBundle actualCalculateChangeResult = simpleVendingMachineController
                .calculateChange(new VendingMachineRequest(1, 1, 1, 1, 1));
        assertEquals(0, actualCalculateChangeResult.number5CentsCoins);
        assertEquals(0, actualCalculateChangeResult.number25CentsCoins);
        assertEquals(1, actualCalculateChangeResult.number1CentsCoins);
        assertEquals(0, actualCalculateChangeResult.number10CentsCoins);
    }

    /**
     * Method under test: {@link SimpleVendingMachineController#calculateChange(VendingMachineRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCalculateChange2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at SimpleVendingMachineController.calculateChange(SimpleVendingMachineController.java:6)
        //   In order to prevent calculateChange(VendingMachineRequest)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   calculateChange(VendingMachineRequest).
        //   See https://diff.blue/R013 to resolve this issue.

        (new SimpleVendingMachineController()).calculateChange(null);
    }
}

