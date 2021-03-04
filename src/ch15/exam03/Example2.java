package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<User> set = new HashSet<>();
		User user = new User("winter" , "한겨울");
		User user1 = new User("winter", "한겨울");
		set.add(user);
		set.add(user1);
		System.out.println(user.hashCode() == user1.hashCode());
		System.out.println(user.equals(user1));
		System.out.println(set.size());
		

	}

}
