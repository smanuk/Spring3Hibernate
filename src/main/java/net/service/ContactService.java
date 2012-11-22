package net.service;

import java.util.List;

import net.domain.Contact;

public interface ContactService
{
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
