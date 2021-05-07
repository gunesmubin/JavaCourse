package Odev5_ETicaret.business.validations.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Odev5_ETicaret.business.validations.abstracts.MailValidation;

public class EmailValidations implements MailValidation {


	@Override
	public boolean checkEMail(String eMail) {
		if (null != eMail) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(eMail);
            if (!matcher.matches()) {
                return false;
            }
        }
		return true;
	}

}
