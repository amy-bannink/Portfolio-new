package mastermind;
import java.util.Random;
import java.util.Scanner;

public class Mastermind_v2
{

    public static void main(String[] args)
    {
	Scanner answer = new Scanner(System.in);
	String [] guess = new String[4];
	String [] position = new String[4];
	String [] colors = {"yellow", "green", "orange", "red", "blue", "purple"};
	
	Integer round = 0;
	Integer black = 0;
	Integer white = 0;
	
	Random random = new Random();
	int index = random.nextInt(colors.length);	

	for (round = 0; round < 4; round++) {
	    index = random.nextInt(colors.length);
	    position[round] = colors[index];
	    System.out.print(position[round]);
	}
	
	round = 0;
	
	while (round < 10 & black != 4) {
	    black = 0;
	    white = 0;
	    round++;
	    System.out.println("Round " + round + "/10. Guess the color of the first position: ");
	    guess[0] = answer.nextLine();
	    System.out.println("Round " + round + "/10. Guess the color of the second position: ");
	    guess[1] = answer.nextLine();
	    System.out.println("Round " + round + "/10. Guess the color of the third position: ");
	    guess[2] = answer.nextLine();
	    System.out.println("Round " + round + "/10. Guess the color of the fourth position: ");
	    guess[3] = answer.nextLine();
	    
	    if (position[0].equals(guess[0])) {
		black++;
	    } else if(position[0].equals(guess[1]) || position[0].equals(guess[2]) || position[0].equals(guess[3])) {
		white++;
	    } 
	    if (position[1].equals(guess[1])) {
	  		black++;
	  	    } else if(position[1].equals(guess[0]) || position[1].equals(guess[2]) || position[1].equals(guess[3])) {
	  		white++;
	  	    } 
	    if (position[2].equals(guess[2])) {
	  		black++;
	  	    } else if(position[2].equals(guess[0]) || position[2].equals(guess[1]) || position[2].equals(guess[3])) {
	  		white++;
	  	    } 
	    if (position[3].equals(guess[3])) {
	  		black++;
	  	    } else if(position[3].equals(guess[0]) || position[3].equals(guess[1]) || position[3].equals(guess[2])) {
	  		white++;
	  	    } 
	    System.out.print(white + " white pawn(s). " + black + " black pawn(s). ");
	    if (black == 4) {
		System.out.print("You cracked the color code! ");
		round = 9;
	    } else {
		System.out.println("You guessed: " + guess[0] + guess[1] + guess[2] + guess[3]);
	    }
	}
	if (black == 4) {
	    System.out.println("Congratulations!");
	} else {
	    System.out.println("You could not crack the color code within 10 rounds. You lost!");
	}}


}
