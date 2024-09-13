import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number, reverse=0, temp;
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        temp =number;

        while(temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp /10;
        }
        if(number == reverse){
            System.err.println("The Number is a Palindrome");
        }else{
            System.err.println("The number is not a Palindrome");
        }
    }
}
