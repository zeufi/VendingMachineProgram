public class SimpleCalculator implements  Calculator{
    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[4]);
        int remainingAmount = amountMoneyToReturn;

        change.number25CentsCoins = remainingAmount / Coin.TWENTYFIVE_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.TWENTYFIVE_CENTS.getValue();

        change.number10CentsCoins = remainingAmount / Coin.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.TEN_CENTS.getValue();

        change.number5CentsCoins = remainingAmount / Coin.FIVE_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.FIVE_CENTS.getValue();

        change.number1CentsCoins = remainingAmount / Coin.ONE_CENTS.getValue();
        return change;
    }
}
