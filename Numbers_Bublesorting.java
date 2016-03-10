package Numbers_Bublesorting;

import java.util.Random;
import java.util.Scanner;

public class Numbers_Bublesorting {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the maximum value");
		int max = scanner.nextInt();
		scanner.close();
		
		int num[] = new int[100000];
		for ( int k = 0;  k < 100000;  k++ )
		{
			num [k] = randint(max); 
		}
		long starttime = System.currentTimeMillis();
		long operTime = BubbleSort(num);
		long endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
		long finalResult = ((operTime * 1000)/(endtime - starttime));
		System.out.print(finalResult);
		
		
  }

		public  static int randint (int n) {
		Random rand = new Random (); 
		int Randomnum = rand.nextInt(n);
			
		return Randomnum;
		}
		

		
		public static long BubbleSort ( int [ ] num )
		{
		     int j;
		     long operNum=0;
		     boolean flag = true;   // set flag to true to begin first pass
		     int temp;   //holding variable

		     while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for( j=0;  j < num.length -1;  j++ )
		            {
		            	
		                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
		                   {
		                           temp = num[ j ];                //swap elements
		                           num[ j ] = num[ j+1 ];
		                           num[ j+1 ] = temp;
		                          flag = true; 
		                          operNum++;				//shows a swap occurred  
		                  } 
		            } 
		      } 
		     return operNum;
		     
		} 
		 
	}

