import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TextVendingMachineInterfaceTest {
    /**
     * Method under test: {@link TextVendingMachineInterface#displayProducts()}
     */
    @Test
    void testDisplayProducts() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        (new TextVendingMachineInterface()).displayProducts();
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#displayEnterCoinsMessage()}
     */
    @Test
    void testDisplayEnterCoinsMessage() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        (new TextVendingMachineInterface()).displayEnterCoinsMessage();
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#confirmOrCancelledRequest()}
     */
    @Test
    void testConfirmOrCancelledRequest() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        (new TextVendingMachineInterface()).confirmOrCancelledRequest();
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#enterCoins(int[])}
     */
    @Test
    void testEnterCoins() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        (new TextVendingMachineInterface()).enterCoins(1, 1, 1, 1);
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#enterCoins(int[])}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEnterCoins2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at CoinBundle.<init>(CoinBundle.java:8)
        //       at VendingMachineRequest.<init>(VendingMachineRequest.java:8)
        //       at TextVendingMachineInterface.enterCoins(TextVendingMachineInterface.java:42)
        //   In order to prevent enterCoins(int[])
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   enterCoins(int[]).
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextVendingMachineInterface()).enterCoins();
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#enterCoins(int[])}
     */
    @Test
    void testEnterCoins3() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        TextVendingMachineInterface textVendingMachineInterface = new TextVendingMachineInterface();
        textVendingMachineInterface.selectProduct(-1);
        textVendingMachineInterface.enterCoins(1, 1, 1, 1);
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#displayChangeMessage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDisplayChangeMessage() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at TextVendingMachineInterface.displayChangeMessage(TextVendingMachineInterface.java:50)
        //   In order to prevent displayChangeMessage()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   displayChangeMessage().
        //   See https://diff.blue/R013 to resolve this issue.

        (new TextVendingMachineInterface()).displayChangeMessage();
    }

    /**
     * Method under test: {@link TextVendingMachineInterface#displayChangeMessage()}
     */
    @Test
    void testDisplayChangeMessage2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.change
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct

        TextVendingMachineInterface textVendingMachineInterface = new TextVendingMachineInterface();
        textVendingMachineInterface.enterCoins(1, 1, 1, 1);
        textVendingMachineInterface.displayChangeMessage();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link TextVendingMachineInterface}
     *   <li>{@link TextVendingMachineInterface#selectProduct(int)}
     * </ul>
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     TextVendingMachineInterface.controller
        //     TextVendingMachineInterface.selectedProduct
        //     TextVendingMachineInterface.change

        (new TextVendingMachineInterface()).selectProduct(1);
    }
}

