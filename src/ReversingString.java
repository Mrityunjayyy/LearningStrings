public class ReversingString {
    public static void main(String[] args) {

        /** case1
        String str = "JAVA" ;
        String rev = "";


        for(int i = str.length() -1 ; i >= 0 ; i--)
        {
           rev =  rev + str.charAt(i);
        }

         **/



        /** case2

        String str = "mrityunjay is my name, I am a 3rd year electrical engineering student at DTU"  ,str2 = "";

        String arr[] = str.split(" ") ;

        for(int i = arr.length -1 ; i >=0 ; i--)
        {
            str2 = str2 + arr[i] + " " ;
        }

        System.out.println(str);
        System.out.println(str2);

        String s1 = "one";

        String s2 = s1.concat("two");
        System.out.println(s2);

         **/

        String s1 = "pwskills java"  , s2 = "";

        String arr[] = s1.split(" ");

        for(String a : arr)
        {
            for(int i = a.length() -1 ; i >= 0 ; i--)
            {
                s2+= a.charAt(i);
            }
            s2 += " ";

        }

        System.out.println(s2);



    }
}
