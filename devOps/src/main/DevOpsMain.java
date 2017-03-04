package main;

import controller.DevOpsController;

public class DevOpsMain {

	public static void main(String[] args) {
	
		DevOpsController controller=new DevOpsController();
		
		controller.set("Akash", "TCS");
		controller.display();

	}

}
