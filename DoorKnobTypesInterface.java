import java.util.ArrayList;
import java.util.Iterator;

public interface DoorKnobTypesInterface {

	void addItem(String name, String description, boolean available, double price);

	ArrayList<DoorKnobMenu> getMenuItems();

	Iterator<DoorKnobMenu> createIterator();

}