package ds.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by skupunarapu on 1/12/2016.
 */
public class BuySellMaxProfitTest {

    @Test
    public void testMax() throws Exception {
        int ar[] = new int[]{23,45,12,67,10,78,98,7,107};
        int maxProfit = new BuySellMaxProfit().max(ar);
        System.out.println(maxProfit);
    }
}