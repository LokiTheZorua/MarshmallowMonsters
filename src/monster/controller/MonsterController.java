package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	public static void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster John = new MarshmallowMonster("John", 7, 7, 6.7, true);
		System.out.println (John);
		
	}
}
