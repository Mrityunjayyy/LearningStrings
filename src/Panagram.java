public class Panagram {
    public static void main(String[] args) {
        boolean flag = false;
      String s = "The quick brown fox jumps over the lazy dog" ;

      s = s.replace(" " , "");
      s = s.toLowerCase() ;

      char arr[] = s.toCharArray() ;
      int arr2[] = new int[26] ;

      for(int i =0 ; i < arr.length ; i++ )
      {
          arr2[arr[i] - 97]++;
      }

      for(int x : arr2)
      {
          if(x == 0)
          {
              System.out.println("Not a Panagram");
              flag = true;
              break ;
          }

      }

      if(!flag)
          System.out.println(s +"\n" + "Above statement is a Panagram.");


//      for(int x : arr2)
//      {
//          System.out.print(x + " ");
//      }

    }
}
