package net.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ContactTests
{
	private static Contact CONTACT;
		
	@BeforeClass
	public static void setupClass()
	{
		CONTACT = new Contact();
	}
		
	@Test
	public void testSetAndGetID()
	{
		Long testId = 23L;
		assertNull(CONTACT.getId());
		CONTACT.setId(testId);
		assertEquals(testId, CONTACT.getId());
	}
	
	@Test
	public void testSetAndGetFirstname()
	{
		String testFirstname = "John";
		assertNull(CONTACT.getFirstname());
		CONTACT.setFirstname(testFirstname);
		assertEquals(testFirstname, CONTACT.getFirstname());
	}
	
	@Test
	public void testSetAndGetLastName()
	{
		String testLastname = "Smith";
		assertNull(CONTACT.getLastname());
		CONTACT.setLastname(testLastname);
		assertEquals(testLastname, CONTACT.getLastname());
	}
	
	@Test
	public void testSetAndGetEmail()
	{
		String testEmail = "test@email.com";
		assertNull(CONTACT.getEmail());
		CONTACT.setEmail(testEmail);
		assertEquals(testEmail, CONTACT.getEmail());
	}
	
	@Test
	public void testSetAndGetTelephone()
	{
		String testTelephone = "02075544332";
		assertNull(CONTACT.getTelephone());
		CONTACT.setTelephone(testTelephone);
		assertEquals(testTelephone, CONTACT.getTelephone());
	}
	
	@Test
	public void testToString()
	{
		assertNotNull(CONTACT.toString());
	}
}
