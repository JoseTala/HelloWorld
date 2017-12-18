
import java.io.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your age? ");
		
		int age = 18;
		
		if (age <= 18){
			System.out.println("You are a teen!");
		}
		else if (19 < age && age < 40){
			System.out.println("You are middle age");
		}
		else if(age == 50 || age == 55){
			System.out.println("You are 50 or 55!!!!");
		}
		else{
			System.out.println("You are too old");
		}
		boolean male = false;
				
		if (!male == true){
			System.out.println("You are a Female");
		}
		else{
			System.out.println("You are a MAN");
		}
	}

	
	
}
