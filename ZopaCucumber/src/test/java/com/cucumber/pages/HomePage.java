package com.cucumber.pages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.cucumber.base.TestBase;

public class HomePage extends TestBase {
	public void Homepage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath=("(//*[contains(@class,'button button--fullWidth')])[1]"))WebElement loanbutton;
	public void clickloanbutton() throws InterruptedException {
		loanbutton.click();
		checktittle("Zopa loans – See rates & apply online");
		
	}
	  @FindBy(xpath="(//label[@class='customRadioButton__label tableResult__radiocheckLabel'])[1]")WebElement radiobutton;
	  @FindBy(xpath="(//input[@type='submit'])[1]")WebElement submitbutton;
	  public void clickradiobutton() throws InterruptedException{
    	  radiobutton.click();
    	  submitbutton.click();
    	 
	  }
	  @FindBy(xpath="//p[@class='important']")WebElement chosentext;
	   public void chosengettext(){
		  if(chosentext.isDisplayed()) {
			  System.out.println("Text visible correctly"+ chosentext.getText());
		  }else {
			  System.err.println("Not visible ");
		  }
		 
	  }
		   }
		   
		  
      
      
    
      


   


