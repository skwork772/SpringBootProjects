import java.util.*;

public class Factorial {

    void findfactorial() {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int fact=1;
        for(int count=a; count>0; count--){
            fact =fact *count;
        }
        System.out.println(fact);

    }
    public static void main(String args[]){
        Factorial fact =new Factorial();
        fact.findfactorial();
    }
}
