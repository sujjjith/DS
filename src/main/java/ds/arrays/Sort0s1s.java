package ds.arrays;

/**
 * Created by skupunarapu on 9/19/2015.
 */
public class Sort0s1s {
    public static void main(String[] args) {
        int[] inAr = {0, 1, 0, 1, 1, 1, 0, 1, 0, 1,1,1,0,0,0,1};

        int[] ouAr = Sort0s1s.sort0s1s(inAr);
        for (int i = 0; i < ouAr.length ; i++) {
            System.out.println(ouAr[i]);
        }
    }

    public static int[] sort0s1s(int[] inAr){
        int i = 0;
        int j = inAr.length -1;

        while(i<j){

            if(i < inAr.length - 1 && inAr[i] == 0){
                i++;
            }

            if(j > 0  && inAr[j] == 1){
                j--;
            }

            else{
                int temp = inAr[i];
                inAr[i] = inAr[j];
                inAr[j] = temp;
            }
        }


        return inAr;
    }
}
