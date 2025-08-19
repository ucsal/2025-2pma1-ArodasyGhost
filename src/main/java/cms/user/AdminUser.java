package cms.user;

public class AdminUser extends User {
	public AdminUser(int id, String email,  String nome, String password) {
		super(id, email, nome, password);
	}
	
	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
