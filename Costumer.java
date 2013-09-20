package Oving2;

import java.awt.Desktop.Action;
import java.util.Random;

public class Costumer implements Runnable {
	private int ID;
	private int numberOfOrders;
	private Random Generator = new Random();
	private ServingArea servingArea;
	
	public Costumer(int id, ServingArea servingArea) {
		ID = id;
		numberOfOrders = Generator.nextInt(10);
		this.servingArea = servingArea;
	}
	
	public int getID() {
		return this.ID;
	}

	@Override
	public void run() {
		
		
	}
	
}
