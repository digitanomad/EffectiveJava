package org.effectivejava.examples.chapter06.etc;

import java.util.List;

/**
 * Ŭ������ �޼ҵ忡 �������̽� ������ ����� ����
 *
 * @since 2016. 7. 3.
 * @author Digitanomad
 */
public class PasswordUtils {

	@UseCase(id = 47, description = "password must contain at least one numeric")
	public boolean validatePassword(String password) {
		return password.matches("w*dw*");
	}
	
	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id = 49, description = "New password can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}