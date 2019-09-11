
public class StoveOffCommand implements Command {
		Stove stove;
		public StoveOffCommand(Stove stove) {
			this.stove = stove;
		}
		public void execute() {
			stove.off();
		}
	}
