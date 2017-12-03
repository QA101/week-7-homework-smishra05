package greetingsUtil;

import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String input = ""; 
      String rev = ""; 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      input = in.nextLine();
 
     for ( int i = input.length()-1; i >= 0; i-- )
         rev = rev + input.charAt(i);
 
      if (input.equals(rev))
         System.out.println("String is a palindrome.");
      else
         System.out.println("String is not a palindrome.");
 in.close();
   }
   
}	