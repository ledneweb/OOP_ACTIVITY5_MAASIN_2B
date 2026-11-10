/* WENDEL JYRUS MAASIN
BSIT 2B
*/
import java.util.*;
import java.util.regex.*;

public class MAASIN_ACTIVITY5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
while(true){
		System.out.println("         PATTERN-MATCHING");
		System.out.println("================================");

		System.out.print("Enter a string: ");
		String string = sc.nextLine();

		System.out.println("\n1. Only digits: "
						   + Pattern.matches("[0-9]+", string));

		System.out.println("2. Only letters: "
						   + Pattern.matches("[a-zA-Z]+", string));
		
		System.out.println("3. Letters and numbers: "
						   + Pattern.matches("[a-zA-Z0-9]+", string));

		System.out.println("4. Starts with Java: "
						   + string.matches("^Java.*"));

		System.out.println("5. Ends with .com: "
						   + string.matches(".*\\.com$"));


		System.out.println("6. Exactly 5 digits: "
						   + string.matches("[0-9]{5}"));


		System.out.println("7. At least 8 characters: "
						   + string.matches(".{8,}"));

		System.out.println("8. Contains whitespace: "
						   + string.matches(".*\\s.*"));
		
		System.out.println("\n Press Enter to Continue");
		String proceed = sc.nextLine();

}
	}

}

/*
    (?i)^Java gamiton para goods ra ang gamay ug dako.
    ( \\. ) gamit para mahimong tuldok( way labot ang '()' )
    Ang nakasulod sa {} kay kung pila ka No. or letters
    .{8,} e check kung 8 ba ang No. or letter tas pwede subra.
    .{0,8} opposite sa subra, kini kay 0 hantud 8 rspud ka letters or No.
    .*\\s.* Contains whitespace
*/
