package Odev3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi : "+ user.email);
	}
	public void update(User user) {
		System.out.println("Kullanıcı Güncellendi : "+ user.email);
	}
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi : "+ user.email);
	}

}
