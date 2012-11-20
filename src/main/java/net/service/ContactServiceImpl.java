package net.service;

import java.util.List;

import net.dao.ContactDAO;
import net.form.Contact;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService
{
	@Autowired
	private ContactDAO contactDAO;

	@Override
	@Transactional
	public void addContact(Contact contact)
	{
		contactDAO.addContact(contact);
	}

	@Override
	@Transactional
	public List<Contact> listContact()
	{
		return contactDAO.listContact();
	}

	@Override
	@Transactional	
	public void removeContact(Integer id)
	{
		contactDAO.removeContact(id);
	}
}
