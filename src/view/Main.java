package view;

import controller.ControllerSummation;

public class Main {

	public static void main(String[] args) {
		ControllerSummation sum = new ControllerSummation();
		int result = sum.Sum(5);
		
		System.out.println(result);
	}

}
