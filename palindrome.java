import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class palindrome 
{
   public static void main(String[ ] args)
   {
	Scanner console = new Scanner(System.in); 
	String inputString;      
      	System.out.print("Enter Your input string expression : ");
        inputString = console.next( );

	if (isPalindrome( inputString )){
		System.out.println("That is a palindrome.");
	}
	else{
		System.out.println("That is not a palindrome.");
      	}
   }

   public static boolean isPalindrome(String input) 
   {   
      Queue<Character> q = new LinkedList<Character>( );
      Stack<Character> s = new Stack<Character>( );
      char letter;
      int i;
      
      for (i = 0; i < input.length( ); i++)
      {
    	 letter = input.charAt(i);
    	 letter = Character.toLowerCase(letter);
    	 q.add(letter);
         s.push(letter);
      }    
      while (!q.isEmpty( ))
      {
         if (q.remove( ) != s.pop( ))
           return false;
      }
      return true; 
   }
    
}