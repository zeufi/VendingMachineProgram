import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        VendingMachineInterface machineInterface = new TextVendingMachineInterface();

        machineInterface.displayProducts();

    int count = 0;
        while(count < 2) {
            String selectedProduct = scanner.nextLine();
            //machineInterface.selectProduct(Integer.parseInt(selectedProduct));
            try {
                if(machineInterface.selectProduct(Integer.parseInt(selectedProduct))>=1 &&
                machineInterface.selectProduct(Integer.parseInt(selectedProduct))<=3) {
                    break;
                    }
                else {
                    System.out.println("Input out off the range, please enter a valid digit between 1-3");
                }

            } catch (InputMismatchException | NumberFormatException e){
                System.out.println("Letters and characters are not allow, please enter a valid digit between 1-3");
            }
            count++;
        }

        machineInterface.displayEnterCoinsMessage();
        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.confirmOrCancelledRequest();
        String choice = scanner.nextLine();
        String [] words = {"yes", "no"};

        if(choice.toLowerCase().equals(words[0])){
            System.out.println("Go ahead");
            System.out.println("Process in progress ...");
            Thread.sleep(3000);
            machineInterface.displayChangeMessage();
        }
        else if(choice.toLowerCase().equals(words[1])){
            System.out.println("Process Cancelled ...");
            Thread.sleep(3000);
            System.out.println("The request have been cancelled, take your refund.");
        }
        else {
            System.out.println("Unknown choice!");
            System.out.println("The request have been cancelled, take your refund.");
        }

        // TODO Allow reset operation for vending machine supplier.
    }
}
