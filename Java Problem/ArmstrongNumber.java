public class ArmstrongNumber {
    public static void main(String[] args) {
        int no=153,no2=no;
        int arm=0;
        do{
            int rem= no %10;
            arm = arm +(rem*rem*rem);
            no=no/10;
        }while(no>0);

        if(no2 == arm){
            System.out.println(arm + " The number is Armstrong Number");
        }else{
            System.out.println("The Number is not an Armstrong Number");
        }
        
    }
    
}
