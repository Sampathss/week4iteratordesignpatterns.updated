import java.util.Iterator;
  
public class DoorKnobIterator implements Iterator<DoorKnobMenu>, DoorKnobIteratorInterface {
	DoorKnobMenu[] list;
	int position = 0;
 
	public DoorKnobIterator(DoorKnobMenu[] list) {
		this.list = list;
	}
 
	@Override
	public DoorKnobMenu next() {
		DoorKnobMenu menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
 
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}