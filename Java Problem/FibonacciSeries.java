import java.util.*;

public class FibonacciSeries{
    public static void main(String args[]){
        int num;
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        num =sc.nextInt();
        System.out.print(a +","+b+",");
        int nextTerm;
        for(int i=2; i<num; i++){
            nextTerm = a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm +",");
        }

    }
}