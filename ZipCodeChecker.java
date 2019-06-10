import java.util.Scanner;

public class ZipCodeChecker {

	public static void main(String[] args) {
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("Please enter the Zip Code");
		String zipCode = input.nextLine();
        
		if(zipCode.length()>5) {
			System.out.println("Not vaild Zip code // more than 5 digits");
		}else if  (zipCode.contains(" ")){
		
        
			System.out.println("Wrong Zip Code // No spaces are allowed");
			System.out.println("do you mean " + zipCode.replace(" ", "") + "?");
        }
		for(char x : zipCode.toCharArray())
		
		
			if(Character.isLetter(x))
			{
				System.out.println("Wrong Zip Code // No letters are alowed");
			
			}
		} 
	}



