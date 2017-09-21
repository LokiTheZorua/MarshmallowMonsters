package monster.controller;

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
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? Oh... ok...");
		}
		
		else if (armEat<0)
		{
			System.out.println("Reality is hard for you - it is impossible to eat a negative amount");
		}
		
		else if (armEat > currentMonster.getArmCount() )
		{
			System.out.println("You cant eat more arms that I have!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("Ok, I now have " + currentMonster.getArmCount() + " arms" ); 
		}
		
		System.out.println( "How many tenticles do you want to give me?");
		//consumed = myScanner.nextInt();
		int tentaGive = myScanner.nextInt();
		
		if(tentaGive == 0)
		{
			System.out.println("Ok, that's fine");
		}
		
		else if (tentaGive < 0)
		{
			System.out.println("Sorry but I won't let you take any of my tenticles.");
		}
		else
		{
			currentMonster.setTentaAmout(currentMonster.getTentaAmount() + tentaGive);
			System.out.println("Thank you! I now have " + currentMonster.getTentaAmount() + " Tenticles");
		}
		
		popup.displayText("Hi there, ready to play?");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow");
		System.out.println(response);
		

		
		myScanner.close(); // Closing prevents memory leaks
	}

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


