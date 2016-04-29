import java.util.Scanner;
public class Gambling 
{
	static int balance = 100;
	static int bet = 0;
	static int guess = 0;
	static int sum = 0;
	static int die = 0;
	public static void main(String[] args) 
		{
		greetUser();
		askBet();
		takeGuess();
		rollDie();
		achieveBalance();
		}	
	public static void greetUser()
		{
		System.out.println("Hi what's your name?");
		Scanner userInput = new Scanner(System.in);
		String name= userInput.nextLine();
		System.out.println("Hi" +" " +name + "!");
		}
	public static void askBet()
		{
		System.out.println("How much would you like to bet?");
		Scanner userInput = new Scanner(System.in);
		bet= userInput.nextInt();
		}
	public static void takeGuess()
		{
		System.out.println("Guess a number 1-6");
		Scanner userInput = new Scanner(System.in);
		 guess= userInput.nextInt();
		}
	public static int rollDie()
		{
		die= (int)(Math.random()*6)+1;
		return die;
		}
	public static void achieveBalance()
		{
	if(die == guess)
		{
		sum = bet + balance;
		System.out.println("Good guess! Your new balance is" + " " + sum);
		}
	else
		{
		sum = balance - bet;
		System.out.println("You arent having a great day! Your new balance is" + " " + sum);
		}
	}
	
}
