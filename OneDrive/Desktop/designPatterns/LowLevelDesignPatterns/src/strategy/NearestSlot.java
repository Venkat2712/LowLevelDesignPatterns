package strategy;

public class NearestSlot implements SlotAllocationStrategy{
	
	@Override
	public void allocateSlot() {
		System.out.println("Slot Allocated through Nearest Selection");	
	}

}
