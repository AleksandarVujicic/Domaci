package d_03_02_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("unesi boju: ");
		String color = s.next();
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

		WebElement body = driver.findElement(By.xpath("//body"));

		js.executeScript("arguments[0].style='background:' + arguments[1]", body, color);

	}

}
