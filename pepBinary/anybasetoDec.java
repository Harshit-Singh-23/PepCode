import java.util.Scanner;
public class anybasetoDec{
    public static Scanner scn = new Scanner(System.in);
    
    
    public static long anybasetoDecimal(long n, long base){   // base = the base from which we have to convert.
        long pow = 1, res = 0;
        while(n != 0){
            long rem = n % 10;
            n /= 10;

            res += rem * pow;
            pow *= base;
        }

        return res;
    }

    public static void main(String[] args){
        long n = scn.nextLong();
        long m = scn.nextLong();
        System.out.println(anybasetoDecimal(n,m));

    }
}