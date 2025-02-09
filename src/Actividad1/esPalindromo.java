package Actividad1;
//Modificado por Guillermo Rodriguez
public class esPalindromo {
	public static boolean validPalindrome(String s) {
	       for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
	           if (s.charAt(i) != s.charAt(j)) {
	               return false;
	           }
	       }
	       return true;
	   }
//Modificacion desde GitHub
	   public static void main(String[] args) {
	       String s1 = "level";
	       String s2 = "cool";
	       String s3 = "Madam";
	       String s4 = "Now, sir, a war is won!";
	       String s5 = "Ventisca";
	       boolean b1 = validPalindrome(s1);
	       boolean b2 = validPalindrome(s2);
	       boolean b3 = validPalindrome(s3);
	       boolean b4 = validPalindrome(s4);
	       boolean b5 = validPalindrome(s5);
	       System.out.println("is " + s1 + " a palindrome? " + b1);
	       System.out.println("is " + s2 + " a palindrome? " + b2);
	       System.out.println("is " + s3 + " a palindrome? " + b3);
	       System.out.println("is " + s4 + " a palindrome? " + b4);
	       System.out.println("is " + s5 + " a palindrome? " + b5);


	   }
}
