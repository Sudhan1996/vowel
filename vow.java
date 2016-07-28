package vowel;
import java.util.Scanner;

public class vow {

	public static void main(String[] args) {
		char ch;
		int lower,upper;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character");
		ch = in.next().charAt(0);
		 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
			        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
			        ch=='u' || ch=='U')
		 {
			 System.out.println("The entered character is Vowel");
		 }
		 else
		 {
			 	System.out.println("The entered character is not a vowel");
		 }

	}

}
