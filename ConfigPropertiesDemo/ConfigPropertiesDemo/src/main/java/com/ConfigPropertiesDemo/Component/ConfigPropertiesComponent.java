package com.ConfigPropertiesDemo.Component;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;



//@Component
//@Configuration
@ConfigurationProperties("app")
public class ConfigPropertiesComponent {

	private String host;
	private int port;
	private String mailService;
	private List<String> mailTo;
	private String username;
	private String password;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getMailService() {
		return mailService;
	}
	public void setMailService(String mailService) {
		this.mailService = mailService;
	}
	public List<String> getMailTo() {
		return mailTo;
	}
	public void setMailTo(List<String> mailTo) {
		this.mailTo = mailTo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
    public String toString() {
		   return "App Details and Credentials " + "Hostname:" + host + "port number:" + port +"\n"+mailService +"\n"+ mailTo+" " + username+" " + password  ;
	   }
	
	
	
	
	
}
