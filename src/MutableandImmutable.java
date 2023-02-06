import java.sql.SQLOutput;

public class MutableandImmutable {
    public static void main(String[] args) {
//        String s1 = "Mrityunjay";
//        String s2 = "Mrityunjay" ;
//
//
//        String s3 = new String("Mrityunjay");
//        String s4 = new String("Mrityunjay" );
//
//        boolean a1 = (s1  == s2) , a2 = ( s3 == s4) ;
//
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s2));
//
//
//
//
//        String s = new String() ;
//        System.out.println(s);
//        System.out.println(s.length());



        String s1 = new String("Mrityunjay") ;
        String s2 = new String("Mrityunjay");
        String s3 = new String("MRITYUNJAY");
        String s4 = "MRITYUNJAY" ;
        System.out.println(s1.equals(s2));


        System.out.println(s3.equals(s4));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
