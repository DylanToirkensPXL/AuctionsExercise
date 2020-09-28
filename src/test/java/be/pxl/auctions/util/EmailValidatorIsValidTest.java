package be.pxl.auctions.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorIsValidTest {

	@Test
	public void returnsTrueWhenValidEmail() {
		// TODO implement test
	}

	@Test
	public void returnsFalseWhenAtSignMissing() {
		String invalidEmail = "dylantoirkens.student.pxl.be";
		assertFalse(EmailValidator.isValid(invalidEmail));
	}

}
