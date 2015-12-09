package ds.numbers;

/**
 * Created by skupunarapu on 10/16/2015.
 */
public class Palindrome {
    public static boolean isPalindrome(int number){
        if(number == Reverse.reverse(number))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
