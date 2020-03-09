package com.ConfigPropertiesDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ConfigPropertiesDemo.Component.ConfigPropertiesComponent;

@RestController
@RequestMapping("/myApp/read/properties")
public class ConfigPropertiesController {
  
	@Autowired
	ConfigPropertiesComponent configPropertiesComponent;
	
	
	@GetMapping("/")
	public String toString() {
		return configPropertiesComponent.toString();
	}
	
	 @GetMapping("/host")
	 public String getHost()
	 {
	  return configPropertiesComponent.getHost();
	 }
	 
	 @GetMapping("/port")
	 public int getPort()
	 {
	  return configPropertiesComponent.getPort();
	 }
	 
	@GetMapping("/mailService")
	public String getMailService()
	{
		return configPropertiesComponent.getMailService();
	}
	
	@GetMapping("/mail")
	public List<String> getMailTo()
	{
		return configPropertiesComponent.getMailTo();
	}
	
	@GetMapping("/username")
	public String getUsername()
	{
		return configPropertiesComponent.getUsername();
	}
	
	@GetMapping("/password")
	public String getPassword()
	{
		return configPropertiesComponent.getPassword();
	}
	
	@GetMapping("/print")
	public void printProp() {
		System.out.println("App details and credentials :- "+" "+configPropertiesComponent.getHost()+" "+configPropertiesComponent.getPort()+" "+configPropertiesComponent.getMailService()+" "+configPropertiesComponent.getMailTo()+" "+configPropertiesComponent.getUsername()+" "+configPropertiesComponent.getPassword());
	}
	
}

 
