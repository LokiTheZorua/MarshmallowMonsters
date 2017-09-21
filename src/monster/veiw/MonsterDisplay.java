package monster.veiw;

import javax.swing.JOptionPane;

public class MonsterDisplay
// makes the pop ups for the rest of the program
{
	public void displayText(String textToDisplay)
	{
		// makes the program able to change what is written in there, starting by making it have nothing
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	public String getResponse(String questionToDisplay)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		
		return answer;
	}
}
