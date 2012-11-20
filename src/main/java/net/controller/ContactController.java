package net.controller;

import java.util.Map;

import net.form.Contact;
import net.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ContactController
{
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contacts")
	public String listContacts(Map<String, Object> map)
	{
		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());	
		return "contacts";
	}
	
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result)
    {    	
        contactService.addContact(contact);
        return "redirect:/contacts";
    }
	
    @RequestMapping("/deleteContact/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId)
    {
        contactService.removeContact(contactId);
        return "redirect:/contacts";
    }
}