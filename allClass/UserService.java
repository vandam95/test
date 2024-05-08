package allClass;

public class UserService {

	public void welcomeMessage() {
		System.out.println("Hello User");
	}
	public void showRank() {
		System.out.println("Hello User");
	}
	public void showBenefits() {
		System.out.println("free stransfer");
	}

	//check rank => link to userService = design pattern - FACTORY
	public UserService classifyRank (String rank) {
		if (rank.equals("brone")) {
			return new BroneUserService();
		} else if (rank.equals("golden")) {
			return new GoldenUserService();
		}
		return new UserService();
	
	}
}
