package ds.numbers;

/**
 * Created by skupunarapu on 10/16/2015.
 */
public class Reverse {

    public static void main(String[] args) {
        int revNum = reverse(12345);
        System.out.println(revNum);
    }

    public static int reverse(int num) {
        int revNum = 0;
        while(num != 0){
            int rem = num %10;
            revNum = revNum * 10 + rem;
            num = num /10;
        }

        return revNum;
    }
}
