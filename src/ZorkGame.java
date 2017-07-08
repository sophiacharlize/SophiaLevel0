import java.util.Scanner;

import javax.swing.JOptionPane;

public class ZorkGame {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String ans = JOptionPane.showInputDialog(null, "what is your name");
		System.out.println("great! get ready for your journey through the tropical forest, and try your best not to die!");
		System.out.println("you have now entered the forest. would you like to go north or south?");
		String input = kb.nextLine();
		if (input.equals("north")) {
			System.out.println("you have met the evil izzy, who kills you");
			System.exit(1);
		}
		if (input.equals("south")) {
			System.out.println("you see light in the distance");
		}
		System.out.println("would you like to continue towards the light or turn around?");
		String answer = kb.nextLine();
		if (answer.equals("continue towards the light")) {
			System.out.println("the light ends up being the evil izzy, holding a lazer, which she uses to kill you");
			System.exit(1);
		}
		if (answer.equals("turn around")) {
			System.out.println("you see another light in the distance");
		}
		System.out.println("would you like to continue towards the light or go east?");
		String person = kb.nextLine();
		if (person.equals("continue towards the light")) {
			System.out.println("you reach a house");
		}
		if (person.equals("go east")) {
			System.out.println("you fall off a cliff");
			System.exit(1);
		}
		System.out.println("would you like to go in the house or go west?");
		String house = kb.nextLine();
		if (house.equals("go in the house")) {
			System.out.println("you enter the kitchen");
		}
		if (house.equals("go west")) {
			System.out.println("you get eaten by a snake and die");
		}
		System.out.println("there are two clear drinks on the table, and you are very thirsty. Do you choose to drink the one on the right or the left?");
		String drink = kb.nextLine();
		if(drink.equals("left")) {
			System.out.println("the drink was water! You are now healthy and have survived the forest!");
			System.exit(1);
		}
		if(drink.equals("right")) {
			System.out.println("the drink was poison and you die");
			System.exit(1);
			
		}
	}
}
