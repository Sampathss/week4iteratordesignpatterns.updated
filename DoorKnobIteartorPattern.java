import java.util.ArrayList;

public class DoorKnobIteartorPattern {

	public static void main(String[] args) {
		DoorKnobTypes types=new DoorKnobTypes();
		ArrayList<DoorKnob> menus=new ArrayList<DoorKnob>();
		menus.add(types);
		DoorKnobsDisplayInterface display=new DoorKnobsDisplay(menus);
		display.displayDoorKnobMenu();
	}

}
