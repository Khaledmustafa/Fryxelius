import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	Random random;
	int diceValue;
	int[] aDice;
	int rollPerTurn = 0;
	
	
	public Dice() {
		diceValue = 0;
		random = new Random();
	}

	public int rollDice() {	
		diceValue = random.nextInt(6)+1;
		return diceValue;
	}
	
	public int [] rollAll() {
		aDice = new int[] { 0, 0, 0, 0, 0 };
		for (int i = 0; i < aDice.length; i++) {
			rollDice();
			aDice[i] =diceValue;	
		}
		
		for (int i = 0; i < aDice.length; i++) { //print dices
			System.out.println((i+1)+". ["+aDice[i] + "]");
		}
		return aDice;
	}
	
	// Method to re-roll certain dice
		public int[] reRoll() {
			String choice = "";
			Scanner scanner = new Scanner(System.in);
			while (rollPerTurn<2) {
				
				System.out.println("\nWhich dices do you want to reroll?");
				System.out.println("enter 's' to skip reroll to save current");
				choice = scanner.nextLine();
				
				if (choice.equals("1")) {
					aDice[0] = rollDice(); // re-roll Die 1
				}
				if (choice.equals("2")) {
					aDice[1] = rollDice(); // re-roll Die 2
				}
				if (choice.equals("3")) {
					aDice[2] = rollDice(); // re-roll Die 3
				}
				if (choice.equals("4")) {
					aDice[3] = rollDice(); // re-roll Die 4
				}
				if (choice.equals("5")) {
					aDice[4] = rollDice(); // re-roll Die 5
				}
				if (choice.equals("s")) {
					rollPerTurn =2; // re-roll Die 5
				}
				rollPerTurn++;
				
				for (int i = 0; i < aDice.length; i++) {
					System.out.println((i+1)+". ["+aDice[i] + "]");// Displaying the dice after re-roll
				}
								
			}
			System.out.println("\nEnd of round");
			return aDice;
			
		}
	
}
