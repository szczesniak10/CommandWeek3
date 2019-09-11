
public class StoveTest {
	public static void main(String[] args) {
		SimpleStoveControl control = new SimpleStoveControl();
		Stove stove = new Stove();
		StoveOnCommand stoveOn = new StoveOnCommand(stove);
		StoveOffCommand stoveOff = new StoveOffCommand(stove);
		control.setCommand(stoveOn);
		control.buttonWasPressed();
		control.setCommand(stoveOff);
		control.buttonWasPressed();
	}
}
