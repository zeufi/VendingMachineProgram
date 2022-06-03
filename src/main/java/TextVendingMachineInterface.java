public class TextVendingMachineInterface implements VendingMachineInterface {
    private final VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;

    @Override
    public void displayProducts() {
        System.out.println(" ******************************************");
        System.out.println(" *   WELCOME TO THE VENDING MACHINE       *  ");
        System.out.println(" ******************************************");
        System.out.println("     Products available:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public int selectProduct(int product) {
        this.selectedProduct = product;
        return product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 1 cents coins,num of 5 cents coins,num of 10 cents coins,num of 25 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,0,2,0");
        System.out.println("Please enter coins:");

    }

    @Override
    public void confirmOrCancelledRequest(){
        System.out.println("Please tape yes to continue the processing or no to stop:  ");
    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is : "+ change.getTotal() + " cents split as follows: ");
        System.out.println("    25 cents coins: "+ change.number25CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);
        System.out.println("    1 cents coins: "+ change.number1CentsCoins);

    }
}
