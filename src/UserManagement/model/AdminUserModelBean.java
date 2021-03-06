package UserManagement.model;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
//contrainte BEAN implements Serializable
public class AdminUserModelBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3919756458401267703L;
	private String lastname;
	private String surname;
	private int age;
	private String login;
	private String pwd;
	
	//Contrainte BEAN constructeur sans paramètre
	public AdminUserModelBean() {
	}
	
	public AdminUserModelBean(String lastname,String surname,int age,String login,String pwd)
	{
		this.lastname = lastname;
		this.surname = surname;
		this.age = age;
		this.login = login;
		this.pwd = pwd;
	}
	//Contrainte BEAN getters et setters normalisés
	public String getLastname() {return lastname;}
	public void setLastname(String lastname) { this.lastname = lastname;}
	public String getSurname() { return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	public int getAge() { return age;}
	public void setAge(int age) {this.age = age;}
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	public String getPwd() {return pwd;}
	public void setPwd(String pwd) {this.pwd = pwd;}
	
	@Override
	public String toString() {
		return "[SURNAME]:"+this.getSurname()+",[LASTNAME]:"+this.getLastname()+",[AGE]:"+this.getAge()+",[LOGIN]:"+this.getLogin()+",[PWD]:"+this.getPwd();
	}
}