public class PlaindromeString{
    public static void main(String[] args) {
        String palindrome = "madam"  ,s2 ="";
        for(int i = palindrome.length() -1 ; i >= 0 ; i--)
        {
            s2 = s2 + palindrome.charAt(i) ;
        }

        if(palindrome.equals(s2))
            System.out.println("Yes '" + palindrome + "' is a plaindrome.");
        else
            System.out.println("No '" + palindrome + "' is not a plaindrome.");
    }
}
