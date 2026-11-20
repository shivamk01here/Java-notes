public class SumOfDigits{
    public static void main(String[] args){
          int n = 11232;
          int FinalSum = SumOfDigits(n);
          System.out.println("the sum of digits of" + " " + n + " " + "is " + FinalSum);
    }

    private static int SumOfDigits(int n){
        int sum = 0;
        int digit = 0;
        while( n > 0){
            sum = sum + n % 10;
            n = n / 10 ;
        }
        return sum ;
    }
}