import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class CoinChangerTest {
    public ArrayList<Integer> expectedCoins;

    @Before
    public void initialize() {
        ArrayList<Integer> expectedCoins = new ArrayList<Integer>();
        this.expectedCoins = expectedCoins;
    }

    @Test
    public void testConstructor() throws Exception {
        CoinChanger coinChanger = new CoinChanger(8);
        assertTrue(coinChanger.getClass().getName() == "CoinChanger");
        assertEquals((Object) 8, coinChanger.changeAmount);
        assertNotNull(coinChanger.coinList);
        assertNotNull(coinChanger.returnedCoins);
    }

    @Test
    public void testReturns1Penny() {
        CoinChanger coinChanger = new CoinChanger(1);
        expectedCoins.add(1);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns1PennyAnd1Nickel() {
        CoinChanger coinChanger = new CoinChanger(6);
        expectedCoins.add(1);
        expectedCoins.add(5);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns2PenniesAnd1Nickel() {
        CoinChanger coinChanger = new CoinChanger(7);
        expectedCoins.add(1);
        expectedCoins.add(1);
        expectedCoins.add(5);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns1PennyAnd1NickelAnd1Dime() {
        CoinChanger coinChanger = new CoinChanger(16);
        expectedCoins.add(1);
        expectedCoins.add(5);
        expectedCoins.add(10);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns1PennyAnd2Dimes() {
        CoinChanger coinChanger = new CoinChanger(21);
        expectedCoins.add(1);
        expectedCoins.add(10);
        expectedCoins.add(10);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns1Penny1Dime1Quarter() {
        CoinChanger coinChanger = new CoinChanger(36);
        expectedCoins.add(1);
        expectedCoins.add(10);
        expectedCoins.add(25);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

    @Test
    public void testReturns4Pennies2Dime3Quarters() {
        CoinChanger coinChanger = new CoinChanger(99);
        expectedCoins.add(1);
        expectedCoins.add(1);
        expectedCoins.add(1);
        expectedCoins.add(1);
        expectedCoins.add(10);
        expectedCoins.add(10);
        expectedCoins.add(25);
        expectedCoins.add(25);
        expectedCoins.add(25);
        assertEquals(expectedCoins, coinChanger.getChange());
    }

}