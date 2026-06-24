public class prime {
    public static void main(String[] args) {
        int n =1;
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
        for(int i=2;i<n;i++){
            if(n%i==0)
                isPrime=false;
            }
            if(isPrime){
                System.out.print(isPrime);}
            else{
                System.out.print("not prime");
            }
     }
}
}