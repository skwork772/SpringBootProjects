import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int n, count=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        if(n<2){
            System.out.println("Not a prime number");
        }
        for(int i=1; i<=n; i++){
            if(n%2 ==0){
                count += 1;
            }
        }
        if(count>2){
            System.err.println("Not a Prime Number");
        }
    }
}
