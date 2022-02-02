package d_28_01_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("unesite zeljeni broj zvezdica: ");
		int x = s.nextInt();

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://s.bootsnipp.com/iframe/WaXlr");
		driver.findElement(By.id("rating-star-" + x)).click();

		driver.close();
	}

}
