package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};

	private int wins = 0;
	
	private void menuOutput() {
		System.out.println("Enter an object.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("> ");
	}
	
	private void announcing() {
		if(wins > 0) {
			System.out.println("You have won!");
		}
		else if(wins < 0) {
			System.out.println("You have lost!");
		}
		else {
			System.out.println("It's a draw!");
		}
	}
	
	public void run() {
		String[] status = {"lose", "draw", "win"};
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
				
			GameObject obj1 = objects[random.nextInt(objects.length)];
			
			menuOutput();
	
			int objectIndex = scanner.nextInt();
			GameObject obj2 = objects[objectIndex - 1];
			
			System.out.println("You chose: " + obj2);
			System.out.println("The computer chose: " + obj1);
			
			int comparison = obj2.compareTo(obj1);
			
			System.out.println(status[comparison + 1]);
			
			wins += comparison;
			
			System.out.println("\n");
			
		}	
		
		scanner.close();
		System.out.println();
		
		announcing();
		
	}
	

}
