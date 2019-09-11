
public class SimpleStoveControl {
	Command slot;
	public SimpleStoveControl() {}
	public void setCommand(Command command) {
		slot = command;

	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
