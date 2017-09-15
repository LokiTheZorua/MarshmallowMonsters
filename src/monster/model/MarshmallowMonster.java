package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members 
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentaAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false or null.
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentaAmount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentaAmount = tentaAmount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description= "I am barely a moster, my name is " + name + ", I have " + eyeCount + " eyes and only " ;
		description += tentaAmount + " tenta... ten tacks... ugh, I can never say it. Tentacles, there we go." ;
		description += " I have " + armCount + " And I have " + hasBloop + " Bloops!";
		
		return description;
	}
}
