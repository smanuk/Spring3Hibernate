package net.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import java.io.Serializable;

@Entity
@Table(name="CONTACTS")
public class Contact implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2551115373271501001L;

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getTelephone()
	{
		return telephone;
	}
	public void setTelephone(String telehpone)
	{
		this.telephone = telehpone;
	}
	
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("ID: " + id + ";");
		buffer.append("Firstname: " + firstname + ";");
		buffer.append("Lastname: " + lastname + "");
		
		return buffer.toString();
	}
}
