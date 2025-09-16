package strategy;

public class FarthestSlot implements SlotAllocationStrategy {

	@Override
	public void allocateSlot() {
		System.out.println("Slot Allocated through Farthest Selection");	
	}

}
