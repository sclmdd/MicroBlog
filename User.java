import java.util.ArrayList;


public class User {

	private String userName;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String avatarPic;
	private static ArrayList<String> userList = new ArrayList<String>();
	
	public User(String userName, String firstName, String lastName,
			String emailAddress, String avatarPic) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.avatarPic = avatarPic;
		this.userList = userList;
	}

	public String getUser()
	{
		return this.userName + this.firstName + this.lastName + this.emailAddress + this.avatarPic;
	}
	public static void chooseUser(int userChoice)
	{
		System.out.println(userList.get(userChoice));
	}
	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getAvatarPic() {
		return avatarPic;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setAvatarPic(String avatarPic) {
		this.avatarPic = avatarPic;
	}
	
	
}
