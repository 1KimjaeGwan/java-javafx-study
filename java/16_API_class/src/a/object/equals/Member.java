package a.object.equals;

public class Member {
	
private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// alt + s + v
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(this.id.equals(m.id)) {
				return true;
			}
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
