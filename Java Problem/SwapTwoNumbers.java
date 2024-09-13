public class SwapTwoNumbers {
    
    public static void main(String args[]){
        int a=10, b=20;

        //Logic - 1 Third Variable
        /*int t =a;
        a=b;
        b=t; */

        //Logic - 2 use + & - without third variable
        /* 
        a= a+b;   //10 + 20 = 30
        b= a-b;   //30 - 20 = 10
        a= a-b;   //30 - 10 = 20      */

        //Logic - 3 use * & / without third variable
        /* 
        a= a*b;
        b= a/b;
        a= a/b;   */

        //Logic -4 use bitwise XOR(^)
        /*
        a= a^20;
        b= a^b;
        a= a^b;   */

        //Logic -5  use  Single Statement

        // b=a+b-(a=b);
    }    
}
