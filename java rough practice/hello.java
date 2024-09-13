class hello{
    public static void main(String[] args) {
        String str ="AnamanA";
        String  reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed : " + str.equals(reversed));
    }
}