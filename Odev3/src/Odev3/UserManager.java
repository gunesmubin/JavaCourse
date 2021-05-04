package Odev3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi : "+ user.email);
	}
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi : "+ user.email);
	}
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi : "+ user.email);
	}

}
