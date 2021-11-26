package test1029;

public class Member {
	private String id;
	private String password;
	private String name;
		
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public Member() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return (m.getId().equals(this.id) && (m.getPassword().equals(this.password)));
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
}
