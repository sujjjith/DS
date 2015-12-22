package ds.numbers;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class First100Prime {
    public void printFirst100Prime(){
        for(int i=1; i<=100; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
                if(isPrime)
                    System.out.println(i);
        }
    }
}
