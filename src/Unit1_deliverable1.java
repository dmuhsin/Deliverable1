import java.util.Scanner;
public class Unit1_deliverable1 {

	public static void main(String[] args) {
		
		
		boolean userPassHasUpper = false;
		boolean userPassHasLower = false;
		boolean userPassHasExclamation = false;
		boolean endLoop = false;
		
		while(endLoop == false) {
			System.out.print("\n Please Create A Password: ");
			Scanner input = new Scanner(System.in);
			String userPass = input.nextLine();
			int userPassLen = userPass.length();
			
			for(char ch: userPass.toCharArray()) {
				if(Character.isUpperCase(ch)==true) {
					userPassHasUpper = true;				
				}
				else if (Character.isLowerCase(ch)==true) {
					userPassHasLower = true;
				}
				else if (ch=='!') {
					userPassHasExclamation = true;
				}
			}
			if(userPassHasUpper==true & userPassHasLower==true & userPassHasExclamation==true & userPassLen>=7 & userPassLen<=12 ) {
				System.out.print("Password valid and accepted");
				endLoop = true;
			}
			else {
				System.out.print("Error");
			}
			
			
			
			
			
		}

	}

}
