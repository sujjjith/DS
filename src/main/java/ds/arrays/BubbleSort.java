package ds.arrays;

import java.util.Arrays;

/**
 * Created by skupunarapu on 9/19/2015.
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if(a[j-1] > a[j]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.println(i+1+"iteration:"+ Arrays.toString(a));
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[] {4,2,7,1,3,8};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}
