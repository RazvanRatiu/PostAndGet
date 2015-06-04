package com.Lina.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Lina.pages.GruyerePage;



public class FiddlerSteps extends ScenarioSteps {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GruyerePage gruyere; 
	
	@Step 
	public void clickOnSignIn(){
		gruyere.clickOnSignIn();
	}
	
	@Step 
	public void enterUsername(String user){
		gruyere.complete_username(user);
	}

	@Step 
	public void enterPassword(String pass){
		gruyere.complete_password(pass);
	}
	
	@Step
	public void logInAction(){
		gruyere.clickonLogin();
	}
	
	@Step
	public void clickOnSnippets(){
		gruyere.clickOnMySnippets();
	}
	
	@Step 
	public void clickOnMyNewSnippets(){
		gruyere.clickOnMySnippets();
	}
	
	@Step 
	public void clickOnSubmit(){
		gruyere.clickOnSubmit();
	}
	
	@Step
	public void newSnippet(){
		gruyere.clickOnNewSnippets();
	}

	@Step 
	public void addNewSnippets(String typos){
		gruyere.addNewSnippet(typos);
	}
	
	
	
}


