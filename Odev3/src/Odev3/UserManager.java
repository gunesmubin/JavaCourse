package Odev3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi : "+ user.email);
	}
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi : "+ user.email);
	}
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi : "+ user.email);
	}

}
