import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String restart;
		
		String guesses[]= {"word"};
		
		boolean startGame = true;
		while (startGame) {
			System.out.println("<<START>>");
			System.out.println("Would you like to play (Y/N)");
			restart = scan.next();
			if (restart.equalsIgnoreCase("Y")) {
				
				int randomNumber = random.nextInt(guesses.length);
				char randomWordToGuess[]=guesses[randomNumber].toCharArray();
				int amountOfGuesses=randomWordToGuess.length;
				char playerGuess[]=new char[amountOfGuesses];
				for(int i=0; i<playerGuess.length; i++) {
					playerGuess[i]='_';
				}
				
		boolean wordIsGuessed=false;
		int tries=0;
		
		while(!wordIsGuessed && tries != amountOfGuesses) {
			System.out.println("Current Guesses: " playerGuess);
			System.out.printf("You have %d amount of tries left.\n"amountOfGuesses-tries);
			System.out.println("Enter a single character: ");
			char input= scan.nextLine().charAt(0);
			tries++;
			
			if(input == '_') {
				wordIsGuessed = true;
				startGame = false;
			} else {
				for(int i=0; i<randomWordToGuess.length; i++){
					if(randomWordToGuess[i] ==input) {
						playerGuess [i] = input;
					}
				}
				
				if(isTheWordGuessed(playerGuess)) {
					wrodIsGuessed = true;
					System.out.println("Congrats");
					
					}
				}
			}
			
		if(!wordIsGuessed) {
			System.out.println("You ran out of guesses.");
		}
		
		System.out.println("Would you like to play again? (Y/N)");
			restart = scan.next();
			if (restart.equalsIgnoreCase("Y"))
				
				
				
		public static void print(char array[]) {
				for(int i=0; i<array.length; i++) {
					System.out.print(array[i]+" ");
					
				}
		System.out.println();
			
		}
		public static boolean isTheWordGuessed(char[]array) {
			boolean condition = true;
			for(int i=0; i<array.length; i++) {
				if (array[i] == '_') {
					condition = false;
				}
				}
			return condition;
			}
		}
		}

		

	}//public static main void

}//public class application
