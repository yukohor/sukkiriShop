package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		Account a = new Account("minato", "1234","yusuke.minato@miyabilink.jp", "港　雄介",23);
		assertEquals("minato", a.getUserId());
		assertEquals("1234", a.getPass());
		assertEquals("港　雄介", a.getName());
		assertEquals("yusuke.minato@miyabilink.jp", a.getMail());
		assertEquals(23, a.getAge());
	}
}
