package greetingsUtil;
import java.util.HashMap;
import java.util.Scanner;



public class DuplicateCharacters {

    public static void main(String[] args) {
        //Create HashMap object to Store Element as Key and Value 
        HashMap<Character,Integer> store= new HashMap<Character,Integer>();

        System.out.println("Enter a String:");
        
        Scanner input = new Scanner(System.in);
       
        String inputString=input.nextLine();
        
        for(int i=0;i<inputString.length();i++)
        {
            if(!store.containsKey(inputString.charAt(i)))
            {
                store.put(inputString.charAt(i),1);
            }
            else
            {
                store.put(inputString.charAt(i),store.get(inputString.charAt(i))+1);
            }

        }
        String dup = "";
        dup = dup + store.keySet().toString();
        System.out.println(dup);
        
        input.close();
    }
}