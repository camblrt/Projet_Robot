package UserManagement.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3642811614942905160L;
	private String login;
	private String pwd;
	public LoginBean() { }
	
	public String getLogin() {return login;}
	public void setLogin(String login) {this.login = login;}
	public String getPwd() {return pwd;}
	public void setPwd(String pwd) {this.pwd = pwd;}
}