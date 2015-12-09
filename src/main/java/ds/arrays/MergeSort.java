package ds.arrays;

/**
 * Created by skupunarapu on 9/19/2015.
 */
public class MergeSort {

    public static void mergeSort(int[] a, int low, int high){

        int N = high - low;

        if(N<=1)
            return;

        int mid = low + N/2;

        mergeSort(a, low, mid);
        mergeSort(a, mid, high);

        int temp[] = new int[N];

        int i = low;
        int j = mid;

        for (int k = 0; k < N; k++) {

            if(i == mid)
                temp[k] = a[j++];

            else if(j == high)
                temp[k] = a[i++];

            else if (a[j] < a[i])
                temp[k] = a[j++];

            else
                temp[k] = a[i++];
        }

        for (int k = 0; k < N; k++) {
            a[low + k] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] a = new int[] {2,6,3,7,1,9,4};
        mergeSort(a, 0, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
