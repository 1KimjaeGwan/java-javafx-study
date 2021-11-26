package t03_state;

public class StateExample {

	public static void main(String[] args) {
		TargetThread targetThread = new TargetThread();
		Thread t = new StatePrintThread(targetThread);
		t.start();
	}

}
