package net.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ContactTests
{
	private static Contact contact;
	
	@BeforeClass
	public static void setupClass()
	{
		contact = new Contact();
	}
		
	@Test
	public void testSetAndGetID()
	{
		Integer testId = 23;
		assertNull(contact.getId());
		contact.setId(testId);
		assertEquals(testId, contact.getId());
	}
	
	@Test
	public void testSetAndGetFirstname()
	{
		String testFirstname = "John";
		assertNull(contact.getFirstname());
		contact.setFirstname(testFirstname);
		assertEquals(testFirstname, contact.getFirstname());
	}
	
	@Test
	public void testSetAndGetLastName()
	{
		String testLastname = "Smith";
		assertNull(contact.getLastname());
		contact.setLastname(testLastname);
		assertEquals(testLastname, contact.getLastname());
	}
	
	@Test
	public void testSetAndGetEmail()
	{
		String testEmail = "test@email.com";
		assertNull(contact.getEmail());
		contact.setEmail(testEmail);
		assertEquals(testEmail, contact.getEmail());
	}
	
	@Test
	public void testSetAndGetTelephone()
	{
		String testTelephone = "02075544332";
		assertNull(contact.getTelephone());
		contact.setTelephone(testTelephone);
		assertEquals(testTelephone, contact.getTelephone());
	}
	
	@Test
	public void testToString()
	{
		assertNotNull(contact.toString());
	}
}
