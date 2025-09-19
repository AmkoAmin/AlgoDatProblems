public class Main {
    public static void main(String[] args) {
        CoinExchange firstTest = new CoinExchange(90, new int[] {10, 20, 50});
        System.out.println("Minimale Anzahl von Muenzen in dieser Kombination: " + firstTest.calcLeastNumberOfCoins());
        //Test
    }
}