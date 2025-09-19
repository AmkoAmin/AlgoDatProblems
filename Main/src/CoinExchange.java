import java.util.*;

public class CoinExchange {
    private int Betrag;
    private int[] coins;
    private static final int INF = 1_000_000_000;
    public CoinExchange(int Betrag, int[] coins){
        this.Betrag = Betrag;
        this.coins = coins;
    }

    public int calcLeastNumberOfCoins(){
        return calcRecursively(Betrag, 0);
    }

    public int calcRecursively(int Betrag, int i){

        if (i == coins.length || Betrag < 0) return INF;

        if (Betrag == 0){
            return 0;
        }

        return Math.min(1 + calcRecursively(Betrag - coins[i], i),
                calcRecursively(Betrag, i +1));
    }
}

