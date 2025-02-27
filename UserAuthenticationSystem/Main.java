import com.authentication.User;
import com.authentication.UserManager;

public class Main {
    public static void main(String[] args) {
        User registeredUser = new User("admin", "password123");  // Fixed credentials
        UserManager.Login.authenticate(registeredUser);
    }
}
