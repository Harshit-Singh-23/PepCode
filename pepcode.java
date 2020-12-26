import java.util.Scanner;
public class pepcode{
    public static Scanner scn = new Scanner(System.in);

    public static int multiply(int a,int b){
        int c = a * b;
        return c;
    }
    
    public static int add(int a,int b){
        int c = a + b;
        return c;
    }
    
    public static int subtract(int a,int b){
        int c = b - a;
        return c;
    }
    
    public static int divide(int a,int b){
        int c = b / a;
        return c;
    }
    
    public static void printmessage(){
       System.out.println("see you soon!");
    }

    public static void gradingSystem(int marks){
        if(marks > 90){
            System.out.println("excellent");
        }else if(marks > 80){
            System.out.println("good");
        }else if(marks > 70){
            System.out.println("fair");
        }else if(marks > 60){
            System.out.println("meets expectations");
        }else{
            System.out.println("below par");
        }
    }

public static void printNtime(int n){

    for(int i=1;i<=n;i++){
        System.out.println("Hello!" + " there");
    }
}    
public static void printtableofN(int n){

 for(int i=1;i<=10;i++){

    System.out.println(n + " X " + i + " = " + n * i ); 

   }
}
public static void printtabletillM(int m){
for( int i=1; i<=m;i++){
    printtableofN(i);
    System.out.println();
}

} 
public static boolean isPrime(int n){

     for(int i=1;i*i<=n;i++){
       if(n % i == 0){
          return true;
       }
       else {
          return false;
       }
    }
}

public static void primenumbers(){
    int t = scn.nextInt();
    for(int i = 1; i <= t; i++){
        int n= scn.nextInt();

        if(isPrime()){
            System.out.println("Prime.");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

public static void primeTillN(int n,int m){
    for(int i = n; i <= m; i++){
        if(isPrime(i)) System.out.println(i);
    }
}

public static int digits(int n)
{
    int count = 0;
    while(n != 0){
        count++;
        n /= 10;
    }
    return count;
}

public static int rotate(int n, int r){
    int len = digits(n);
    r %= len;
    if(r<0) r += len;
    int mul = 1;
    int div = 1;

    for (int i = 1;i <= len; i++){
        if(i <= r) div *= 10;
        else mul *= 10;
    }

    int a = n % div;
    int b = n / div;

return a * mul + b;

}




public static void main(String[] args){
    //     System.out.println("Hello");
    //     System.out.println("Pepcoder");
    // int a = scn.nextInt();
    // int b = scn.nextInt();

    // System.out.println(multiply(a,b));
    // System.out.println(divide(a,b));
    // System.out.println(add(a,b));
    // System.out.println(subtract(a,b));
    // printmessage();
//    int n = scn.nextInt();
//     printNtime(n);
//printtableofN(n);
// printtabletillM(n);
// int n = scn.nextInt();
// int k = scn.nextInt();
// System.out.println(rotate(n,k));




}
}

