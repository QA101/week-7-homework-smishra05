package greetingsUtil;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size=0;
		int flag = 1;
		System.out.println("Enter how many numbers you want to enter: ");
		size = in.nextInt();
	
		      int[] orig = new int[size];
		      int[] rev = new int[size]; 
		     
		      for(int i=0;i<size;i++)
				{
					orig[i]=in.nextInt();
				}
		      
		    int j = 0;
		     for ( int i = orig.length-1; i >= 0; i--)
		     {
		         rev[j] = orig[i];
		         j++;
		         
		     }
		     for ( int i = 0; i < orig.length; i++ )
		     {
		         if(orig[i]!=rev[i])
		        {
		        	flag = 0;
		        }
		        		         
		     }
		     if (flag==1)
		         System.out.println("integer array is a palindrome.");
		      else
		         System.out.println("integer array is not a palindrome.");
		 in.close();
		   }
		   
		
	}


