import java.util.*;
  
     
public class DoorKnobsDisplay implements DoorKnobsDisplayInterface {
	ArrayList<DoorKnob> menus;
     
  
	public DoorKnobsDisplay(ArrayList<DoorKnob> menus) {
		this.menus = menus;
	}
   
	@Override
	public void displayDoorKnobMenu() {
		Iterator<?> DoorknobIterator = menus.iterator();
		while(DoorknobIterator.hasNext()) {
			DoorKnob menu = (DoorKnob)DoorknobIterator.next();
			displayDoorKnobMenu(menu.createIterator());
		}
	}
   
	void displayDoorKnobMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			DoorKnobMenu menuItem = (DoorKnobMenu)iterator.next();
			System.out.println("Name : "+menuItem.getName());
			System.out.println("Price :"+menuItem.getPrice() + "$ ");
			System.out.println("Info :"+menuItem.getDescription()+ " \nisAvailable :"+menuItem.isavailable());
		}
	}
}  