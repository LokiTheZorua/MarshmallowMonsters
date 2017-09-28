package monster.controller;
// Imports stuff from other flies
import monster.model.MarshmallowMonster;
import java.util.ArrayList;
import java.util.Scanner;
import monster.veiw.MonsterDisplay;
import java.util.List;
public class MonsterController
{
	private MonsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
		monsterList = new ArrayList<MarshmallowMonster>();
	}
	public void start()
	{
//		int count = 0;
//		while(count < 10)
//		{
//			count =+ 2;
//			popup.displayText("Am I not the coolest?");
//		}
		
		for(int loop = 0; loop < 10; loop += 1)
		{
			popup.displayText("This is loop #" + (loop+ 1) + " of ten");
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
		
		monsterList.add(basic);
		monsterList.add(John);
		
		
		interactWithMonster(John);
		
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
//		
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getname() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getname() + " wants to know how many eyes you want to eat, please type in how many.");
//		
		while(!isValidInteger(response))
		{
			popup.displayText("Grrr, please type in the correct thing");
			response = popup.getResponse("Type in an integer vaule!"); 
		}
		consumed = myScanner.nextInt();
		
		while(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
//		System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		int armEat = 0;
		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		String armResponse = popup.getResponse("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
		consumed = myScanner.nextInt();
		
		while(!isValidInteger(response))
		{
			popup.displayText("Please put in somehthing correct");
			response = popup.getResponse("Please put something valid");
		}
		armEat = Integer.parseInt(armResponse);
		currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
		System.out.println("Ok, I now have " + currentMonster.getArmCount() + " arms" ); 
		
		
//		
//		if(isVaildInteger(armResponse)
//				{
//			armEat = Integer.parseInt(armResponse);
//	

//		// makes the if then stuff
//		if(armEat == 0)
//		{
////			System.out.println("Not hungry? Oh... ok...");
//			popup.displayText("Not hungry? Oh... ok...");
//		}
//		
//		else if (armEat<0)
//		{
////			System.out.println("Reality is hard for you - it is impossible to eat a negative amount");
//			popup.displayText(" Reality is hard for oyu - it is impossible to eat a negative amount");
//		}
//		
//		else if (armEat > currentMonster.getArmCount() )
//		{
////			System.out.println("You cant eat more arms that I have!");
//			popup.displayText("You can't eat more arms than I have!");
//		}
//		else
	
		
		popup.displayText("Ok, I now have " + currentMonster.getArmCount() + " arms");
		System.out.println( "How many tenticles do you want to give me?");
		popup.displayText("How many tenticles do you want to give me?");
		//consumed = myScanner.nextInt();
		double tentaGive = 0.0;
		
		while (!isValidInteger(response))
		{
			popup.displayText("Come on, just say somethin correct!");
			popup.getResponse("How many arms do you want to give me?");
			
		}
		currentMonster.setTentaAmout(currentMonster.getTentaAmount() + tentaGive);
//		if(tentaGive == 0)
//		{
////			System.out.println("Ok, that's fine");
//			popup.displayText("Ok, that's fine");
//		}
//		
//		else if (tentaGive < 0)
//		{
////			System.out.println("Sorry but I won't let you take any of my tenticles.");
//			popup.displayText("Sorry but I won't let you take any of my tenticles.");
//		}
//		else
//		{
//			currentMonster.setTentaAmout(currentMonster.getTentaAmount() + tentaGive);
////			System.out.println("Thank you! I now have " + currentMonster.getTentaAmount() + " Tenticles");
//			popup.displayText("Thank you! I now have " + currentMonster.getTentaAmount() + " Tenticles");
//		}
		
		popup.displayText("Hi there, ready to play?");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow");
		popup.displayText("Oh so it's " + answer + " Thanks");
		

		
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


