package d_07_02_2022Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public FormPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public void getRole(String role) {
		Select dropdown =  new Select (driver.findElement(By.id("role")));
		dropdown.selectByVisibleText(role); 
	}

	public WebElement getComment() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement getGenderRadioButton(String genderValue) {
		return driver.findElement(By.xpath("//input[@name= 'gender'][@value= '']"));
	}

	public WebElement getCheckboxInput(String CheckboxValue) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='" + CheckboxValue + "']"));
	}
	public WebElement getSubmitButton () {
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		return driver.findElement(By.id("submit"));
	}
	public boolean isFormSaved () {
		
		boolean savedForm = false;
		String message = driver.findElement(By.className("message-element poruka")).getAttribute("style");
		if (message.equals("visibility: visible;")) {
			savedForm = true;
		}
		return savedForm;
	}
}
