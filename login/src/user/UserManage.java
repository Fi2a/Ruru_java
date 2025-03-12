package user;

import java.util.ArrayList;

public class UserManage {
	
	private ArrayList<User> user = new ArrayList<>();
	
	public void add(User u) {
		user.add(u);
	}
	
	public void rep(User u) {
		for(User list : user) {
			System.out.println(list);
		}
	}
	
}

