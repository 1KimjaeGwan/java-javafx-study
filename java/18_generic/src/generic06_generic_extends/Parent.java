package generic06_generic_extends;

public class Parent <T, M>{
	
	private T kind;
	private M mode;
	
	
	public T getKind() {
		return kind;
	}
	
	public M getMode() {
		return mode;
	}

	public void setMode(M mode) {
		this.mode = mode;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
	
	
	@Override
	public String toString() {
		return "Parent [kind=" + kind + ", model=" + mode + "]";
	}
	
	
}
