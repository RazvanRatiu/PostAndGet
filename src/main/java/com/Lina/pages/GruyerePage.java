package com.Lina.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://http://google-gruyere.appspot.com/577480239554/")
public class GruyerePage extends PageObject {
	
	@FindBy(css="a[href='/577480239554/login']")
	private WebElement signin;
	
	@FindBy(name="uid")
	private WebElementFacade username;
	
	@FindBy(name="pw")
	private WebElementFacade password;
	
	@FindBy(css="td[align='right'] input[value='Login']")
	private WebElement login;
	
	@FindBy(css="div[class='menu'] a[href*='snippets']")
	private WebElement mysnippets;
	
	@FindBy(css="div[class='menu'] a[href*='new']")
	private WebElement newsnippet;
	
	@FindBy(css="textarea[name='snippet']")
	private WebElementFacade addnewsnippet;
	
	@FindBy(css="td[align='right'] input[value='Submit']")
	private WebElementFacade submitbutton;
	
	public void clickOnSignIn(){
		signin.click(); 
	}
	public void complete_username(String user){
		username.type(user);
	}
	
	public void complete_password(String pass){
		password.type(pass);
	}
	
	public void clickonLogin(){
		login.click();
	}
	
	public void clickOnMySnippets(){
		mysnippets.click();
	}

    public void clickOnNewSnippets(){
    	newsnippet.click();
    }
	
    public void addNewSnippet(String typos){
    	addnewsnippet.type(typos);
    }
    
    public void clickOnSubmit(){
    	submitbutton.click();
    }
    
    
    
}
	
