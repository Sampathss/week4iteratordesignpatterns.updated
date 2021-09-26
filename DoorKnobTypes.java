import java.util.ArrayList;
import java.util.Iterator;

public class DoorKnobTypes implements DoorKnob, DoorKnobTypesInterface {
	ArrayList<DoorKnobMenu> menuItems;
 
	public DoorKnobTypes() {
		menuItems = new ArrayList<DoorKnobMenu>();
    
		addItem("Baldwin Round Door Knob ", 
			"Functions available: keyed entry, privacy, passage, full dummy, and half dummy." ,
			true,
			30.99);
 
		addItem("Copper Creek Ball Door Knob ", 
			"Copper Creek Colonial Privacy Door Knob Set with Ball Knob and Round Rose", 
			false,
			20.99);
	}

	@Override
	public void addItem(String name, String description,
	                    boolean available, double price)
	{
		DoorKnobMenu menuItem = new DoorKnobMenu(name, description, available, price);
		menuItems.add(menuItem);
	}
 
	@Override
	public ArrayList<DoorKnobMenu> getMenuItems() {
		return menuItems;
	}
  
	@Override
	public Iterator<DoorKnobMenu> createIterator() {
		return menuItems.iterator();
	}

}