package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	public static void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster John = new MarshmallowMonster("John", 2, 5, 3, true);
		System.out.println (John);
		System.out.println ("I am feeling hungry, I am going to eat one of his arms.");
		John.setArmCount(John.getArmCount()- 1);
		System.out.println(John);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getname() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
		System.out.println(currentMonster);
		
		myScanner.close();
	}
}
