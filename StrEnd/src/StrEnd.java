import java.util.Scanner;

public class StrEnd {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String yourString;
		boolean over = false;
		
		System.out.print("Type a string (ends when you type 'end'): ");
		while(!over) {
			yourString = s.nextLine();
			System.out.println("\tYour string: " + yourString);
			if (yourString.equals("end")) {
				over = true;
			} else {
				System.out.print("Type next string: ");
			}
		}
		System.out.println("Program ends...");
	}
	
}
