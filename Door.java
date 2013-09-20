package Oving2;

public class Door implements Runnable {
	Costumer costumer;
	private int ID = 0;
	
	ServingArea servingaArea;	
	
	
	public Door(ServingArea servingArea) {
		this.servingaArea = servingArea;
//		System.out.println("The door");
	}

	@Override
	public void run() {
		while(SushiBar.isOpen) {
			System.out.println("Nå er baren åpen");
			costumer = new Costumer(ID++, this.servingaArea);
			
			try {
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
