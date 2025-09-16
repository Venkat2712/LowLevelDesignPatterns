package strategy.parkingSlotFactory;

import strategy.FarthestSlot;
import strategy.NearestSlot;
import strategy.RandomSlot;
import strategy.SlotAllocationStrategy;

public class ParkingSlotFactory {
	
	
	
	
	 public  static SlotAllocationStrategy  selectParkingSlot(String slotName) {
		 SlotAllocationStrategy slot =null;
		 if(slotName.equals("Farthest")) {
			 slot = new FarthestSlot(); 
		 }
		 
		 else if(slotName.equals("Shortest")) {
			 slot = new NearestSlot();
		 }
		 
		 else if(slotName.equals("Random")) {
			 slot = new RandomSlot();
		 }
		 
		 return slot;
	 }

}
