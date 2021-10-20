package week3.day1;

public class Bajaj extends Auto {
	public static void main(String[] args) {
		Bajaj B= new Bajaj();
		B.accelerate();
		B.applyBrake();
		B.driveVehicle();
		B.fillfuel();
		B.shiftgear();
		System.out.println("wheelAutocount:" + B.wheelAuto);
	}

}
