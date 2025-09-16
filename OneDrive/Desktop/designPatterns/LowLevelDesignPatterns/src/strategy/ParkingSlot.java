package strategy;

public class ParkingSlot {
	
	
	 SlotAllocationStrategy slotAllocation;
	
	
	ParkingSlot(SlotAllocationStrategy slotAllocation){
		this.slotAllocation = slotAllocation;
	}
	
	
	public void generateSlot() {
		slotAllocation.allocateSlot();
	}

}
