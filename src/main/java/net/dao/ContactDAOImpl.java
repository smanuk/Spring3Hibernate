package net.dao;

import java.util.List;

import net.domain.Contact;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpl implements ContactDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addContact(Contact contact)
	{
		sessionFactory.getCurrentSession().save(contact);
	}

	@Override
	public List<Contact> listContact()
	{		
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	@Override
	public void removeContact(Integer id)
	{
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
		
		if (contact != null)
		{
			sessionFactory.getCurrentSession().delete(contact);
		}
	}
}
