import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("enter a number to check if it is a palindrome or not: ");
        int n = in.nextInt() ;
        int rev = 0 , temp = n ,rem = 0 ;


        while(temp > 0)
        {
            rem = temp % 10 ;
            temp = temp/10 ;

            rev = rev * 10 + rem ;

        }
        if(rev == n)
        System.out.println(rev + " It is a palindrome number");
        else
            System.out.println(rev + " It is not a palindrome number");
    }
}
