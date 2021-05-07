package Odev5_ETicaret.dataAccess.abstracts;

import Odev5_ETicaret.entities.concretes.Customer;

public interface CustomerDao {
	boolean add(Customer customer );
	boolean login(String eMail, String password);
	boolean checkEmail(String eMail);
}
