package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{

	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null,  "I made a Monster");
		JOptionPane.showMessageDialog(null,  "It's name is "+baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null,  "He has " +baseController.getMyMonster().getNumberOfLegs()+" legs.");
		JOptionPane.showMessageDialog(null,  "The number of arms he has is "+baseController.getMyMonster().getArmCount()+"");
		JOptionPane.showMessageDialog(null,  "The answer to the question 'Does he have a belly button' is "+baseController.getMyMonster().hasBellyButton()+"");
	}
	
}
