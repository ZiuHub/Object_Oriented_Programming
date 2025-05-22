
public class BasicLogin implements ILogin {

	private String name;
	private String password;

	public BasicLogin(String name, String password) {
		this.name = name;
		this.password = password;
	}

	@Override
	public boolean authenticate(String username, String password) {
		return this.name.equals(username) && this.password.equals(password);
	}
}
