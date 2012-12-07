package net.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import net.dao.ContactDAO;
import net.domain.Contact;

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
	@Transactional(readOnly=true)
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
