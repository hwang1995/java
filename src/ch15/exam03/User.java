package ch15.exam03;

public class User {
	private String id;
	private String name;
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) { // 들어오는 객체는 User여야 하고
			User temp = (User) obj;
			if(id.equals(temp.id)) { // user의 id와 객체의 id가 같아야 True
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	

}
