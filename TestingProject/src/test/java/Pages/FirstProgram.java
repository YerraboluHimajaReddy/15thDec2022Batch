package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstProgram {

	WebDriver driver;
	
	public FirstProgram(WebDriver driver){
		
		this.driver = driver;
	}
	
	public By userName_TextBox = By.cssSelector("input[name='username']");
		
	public By cancel_Button = By.xpath("//button[@type='button']");
	
	public By reset_Button = By.xpath("//button[@type='submit']");
	

}
