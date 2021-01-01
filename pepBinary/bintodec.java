import java.util.Scanner;
public class bintodec{
    public static Scanner scn = new Scanner(System.in);
    
    
    public static long binaryToDecimal(long n){
        long pow = 1, res = 0;
        while(n != 0){
            long rem = n % 10;
            n /= 10;

            res += rem * pow;
            pow *= 2;
        }

        return res;
    }

    public static void main(String[] args){
        long n = scn.nextLong();
        System.out.println(binaryToDecimal(n));

    }
}