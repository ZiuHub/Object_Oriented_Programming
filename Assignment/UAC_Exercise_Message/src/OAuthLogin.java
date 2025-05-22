public class OAuthLogin implements ILogin {
	
	private String token;
	
	@Override
	public boolean authenticate(String username, String password) {
		return this.token.equals(password);
	}

	public OAuthLogin(String token) {
		this.token = token;
	}
}
