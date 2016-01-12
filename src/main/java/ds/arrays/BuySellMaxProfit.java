package ds.arrays;

/**
 * Created by skupunarapu on 1/12/2016.
 */
public class BuySellMaxProfit {

    public int max(int arr[]){
        int maxProfit = arr[1] - arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] - min > maxProfit)
                maxProfit = arr[i] - min;

            if(arr[i] < min)
                min = arr[i];
        }
        return maxProfit;
    }
}
