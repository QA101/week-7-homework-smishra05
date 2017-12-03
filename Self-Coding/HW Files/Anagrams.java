package greetingsUtil;

import java.util.*;
 
class Anagrams
{
   public static void main(String args[])
   {
      String input1 = ""; 
      String input2 = ""; 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter 2 strings to check if they are anagrams of each other");
      input1 = in.nextLine();
      input2 = in.nextLine();
      char[] charArr1 = input1.toCharArray();
      char[] charArr2 = input2.toCharArray();
      if(input1.length()!=input2.length())
      {
    	  System.out.println("Not an anagram");
      }
      Arrays.sort(charArr1);
      Arrays.sort(charArr2); 
   
      if(Arrays.equals(charArr1, charArr2))
         System.out.println("Anagram.");
      else 
         System.out.println("Not an anagram");
 in.close();
   }
   
}	