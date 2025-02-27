package users;
import main.LoginSystem;
public class UserManager{
	static final String storedUsername = "abc";
	static final String storedPassword = "helloworld";

	public static LoginProcessor{
		static boolean authenticate(String username, String password){
			if (storedUsername.equals(username) && storedPassword.equals(password)){
				return true;
			}
		}
	}


}