import java.util.ArrayList;
import java.util.Collections;

public class CoinChanger {
    public Integer changeAmount;
    public ArrayList<Integer> coinList;
    public ArrayList<Integer> returnedCoins;

    public CoinChanger(Integer changeAmount) {
        this.changeAmount = changeAmount;
        this.coinList = new ArrayList<Integer>();
            coinList.add(25);
            coinList.add(10);
            coinList.add(5);
            coinList.add(1);
        this.returnedCoins = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getChange() {
        for (Integer coinValue : coinList) {
            while (changeAmount > coinValue){
                changeAmount -= coinValue;
                returnedCoins.add(coinValue);
            }
        }
        returnedCoins.add(changeAmount);
        Collections.sort(returnedCoins);
        return returnedCoins;
    }

}