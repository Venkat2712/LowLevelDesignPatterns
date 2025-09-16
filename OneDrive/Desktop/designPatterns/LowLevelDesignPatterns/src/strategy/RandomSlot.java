package strategy;

public class RandomSlot implements SlotAllocationStrategy{

	
	@Override
	public void allocateSlot() {
		System.out.println("Slot Allocated through Random Selection");	
	}
}
