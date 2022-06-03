public interface VendingMachineInterface {
    void displayProducts();

    int selectProduct(int product);

    void displayEnterCoinsMessage();

    void confirmOrCancelledRequest();

    void enterCoins(int... coins);

    void displayChangeMessage();
}
