package sach;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public int number;
	public int inputnumber;
	public int noOfGuesses = 0;
	
	public int getnoOfGuesses() {
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses)
	{
		this.noOfGuesses = noOfGuesses;
	}
	
	 GuessTheNumber()
	{
		Random rand = new Random();
        this.number = rand.nextInt(100);
	}
	
	 void takenumber() 
	{
		System.out.print("Guess the Number: ");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
	}
	
	boolean isCorrectNumber()
	{
		noOfGuesses++;
		if(inputnumber == number)
		{
			 System.out.format("Yes you guessed it right, it is %d\nYou it in %d attempts\n", number, noOfGuesses);
			 return true;
		}
		 else if(inputnumber<number){
	            System.out.println("Too low...");
	        }
	        else if(inputnumber>number){
	            System.out.println("Too high...");
	        }
	        return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuessTheNumber rng = new GuessTheNumber();
		boolean b = false;
		while(!b)
		{
			rng.takenumber();
			b = rng.isCorrectNumber();
		}
		
		
		
	}

}
