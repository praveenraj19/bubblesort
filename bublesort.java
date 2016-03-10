package word;

public class bublesort
{
     public static void main(String[ ] args)
     {
             String[ ] names = {"praveen", "Bhabin", "Taffazzel", "george"};
             sortStringBubble (names);
             int len=names.length;
             for ( int k = 0;  k < len;  k++ )
                System.out.println( names [ k ] );
      }

      public static void sortStringBubble( String  x [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      } 
}
