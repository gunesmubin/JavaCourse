package Odev5_ETicaret.business.abstracts;

import Odev5_ETicaret.entities.concretes.Customer;

public interface CustomerService {
	String add(Customer customer );
	String login(String eMail, String password);


}
