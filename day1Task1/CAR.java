package week1.day1Task1;

public class CAR {

	public void applyGear() {
		System.out.println("applyGear");
	}
	
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	
     public void applyAcclerator() {
    	 System.out.println("applyAcclerator");
     }
	
	public static void main (String[] args) {
	
		CAR porsche = new CAR();
		porsche.applyGear();
		porsche.switchOnAc();
		porsche.applyAcclerator();
		
	}
	
	
}
