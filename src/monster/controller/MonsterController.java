package monster.controller;
// Imports stuff from other flies
import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.veiw.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	public void start()
	{
		int count = 0;
		while(count < 10)
		{
			popup.displayText("Am I not the coolst?");
		}
		
		
		
		// starts the original pop ups
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster John = new MarshmallowMonster("John", 2, 5, 3, true);
//		System.out.println (John);
		popup.displayText(John.toString());
//		System.out.println ("I am feeling hungry, I am going to eat one of his arms.");
		popup.displayText("I am feeling hungry, I am going to eat one of his arms");
		John.setArmCount(John.getArmCount()- 1);
//		System.out.println(John);
		popup.displayText(John.toString());
		interactWithMonster(John);
		
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getname() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getname() + " wants to know how many eyes you want to eat, please type in how many.");
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
//		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
//		System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		int armEat = 0;
//		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		String armResponse = popup.getResponse("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		//consumed = myScanner.nextInt();

//		
//		if(isVaildInteger(armResponse)
//				{
//			armEat = Integer.parseInt(armResponse);
//	

		// makes the if then stuff
		if(armEat == 0)
		{
//			System.out.println("Not hungry? Oh... ok...");
			popup.displayText("Not hungry? Oh... ok...");
		}
		
		else if (armEat<0)
		{
//			System.out.println("Reality is hard for you - it is impossible to eat a negative amount");
			popup.displayText(" Reality is hard for oyu - it is impossible to eat a negative amount");
		}
		
		else if (armEat > currentMonster.getArmCount() )
		{
//			System.out.println("You cant eat more arms that I have!");
			popup.displayText("You can't eat more arms than I have!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
//			System.out.println("Ok, I now have " + currentMonster.getArmCount() + " arms" ); 
			popup.displayText("Ok, I now have " + currentMonster.getArmCount() + " arms");
		}
		
//		System.out.println( "How many tenticles do you want to give me?");
		popup.displayText("How many tenticles do you want to give me?");
		//consumed = myScanner.nextInt();
		double tentaGive = 0.0;
		
		if(tentaGive == 0)
		{
//			System.out.println("Ok, that's fine");
			popup.displayText("Ok, that's fine");
		}
		
		else if (tentaGive < 0)
		{
//			System.out.println("Sorry but I won't let you take any of my tenticles.");
			popup.displayText("Sorry but I won't let you take any of my tenticles.");
		}
		else
		{
			currentMonster.setTentaAmout(currentMonster.getTentaAmount() + tentaGive);
//			System.out.println("Thank you! I now have " + currentMonster.getTentaAmount() + " Tenticles");
			popup.displayText("Thank you! I now have " + currentMonster.getTentaAmount() + " Tenticles");
		}
		
		popup.displayText("Hi there, ready to play?");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow");
		System.out.println(response);
		

		
		myScanner.close(); // Closing prevents memory leaks
	}
// makes sure that the imput from the user is correct
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to imput an int, " + sample + "is not valid");
		}
		return valid;
	}
}


