package net.dao;

import java.util.List;

import net.domain.Contact;

public interface ContactDAO
{
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
