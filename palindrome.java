public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int rev=0,org=n;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        } if(rev==org){
            System.out.print("Palindrome"+ " " +rev);
        }else{
            System.out.println("Not Palindrome"+" " +rev);
        }
    }
    
}
