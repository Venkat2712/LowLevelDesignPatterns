package strategy;

import java.util.Scanner;

import strategy.parkingSlotFactory.ParkingSlotFactory;

public class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of Slot you need ! :");
		String name = sc.nextLine();
		
		SlotAllocationStrategy strategy = ParkingSlotFactory.selectParkingSlot(name);
		
		ParkingSlot parkingSlot = new ParkingSlot(strategy);
		
		parkingSlot.generateSlot();
	}

}
