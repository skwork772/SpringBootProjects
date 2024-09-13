public class ReverseString{
    public static void main(String[] args) {
       //Reverse a String
       String word = "ABCD";
       String word2 = "";
       for(int i=word.length()-1; i>=0; i--){
        //System.out.print(word.charAt(i));
        word2 = word2 + word.charAt(i);
       } 
       System.out.println(word2);
       if(word.equals(word2)){
            System.out.println("String is Palindrome");
       }else{
         System.out.println("String is Not a Palindrome");
       }
    }
}