import java.util.*;
public class Lab9 {
    //Lab 10 B
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
        System.out.println("What is your name: ");
        String input = console.nextLine();
        boolean result= Palindrome(input);
        if (result){
        	System.out.println(input+" is palindrome!");
        }else{
        System.out.println(input+" is not palindrome!");
        }	}
   public static boolean Palindrome(String str){
	   int j= str.length()-1;
	   for (int i=0; i< j; i++){
		   if (str.charAt(i)!=str.charAt(j)){
			   return false;
	   }
	   j--;
	   }
	   return true;
   }
}
