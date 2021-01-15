import java.util.Scanner;
public class javapractical1{

    public static Scanner scn = new Scanner(System.in);

    public static void isPalindrome(String str){
        int j = str.length() - 1;
        int i = 0;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)){
                System.out.println("The String is not a Palindrome. ");
            return;
            }          
        }
        System.out.println("The String is a Palindrome. ");
        
    }

    public static void main(String[] args){
        String s = scn.next();
    isPalindrome(s);
    }


}