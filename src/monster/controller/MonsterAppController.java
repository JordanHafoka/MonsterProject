package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController
{

		private MonsterView myAppView;
		private MarshmallowMonster myMonster;
		private MarshmallowMonster otherMonster;
		
		public MonsterAppController()
		{
			myAppView = new MonsterView(this);
			myMonster = new MarshmallowMonster("Keith", 4.0, 1.0, 3, 1, 6, true);
			otherMonster = new MarshmallowMonster("Geoff", 1.0, 6.0, 4, 6, 9, false);
			
			//create your monster here.
		}
		public MarshmallowMonster getMyMonster()
		{
			return myMonster;
		}
		
		public void start()
		{
			myAppView.displayInformation();
		}
}
