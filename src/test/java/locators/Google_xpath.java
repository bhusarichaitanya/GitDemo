package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		boolean buttongoogle = driver.findElement(By.xpath("//input[@class=\"gNO89b\"]/parent::*/parent::div[1][@class=\"FPdoLc lJ9FBc\"]//input[@value=\"Google Search\"]")).isDisplayed();
		System.out.println(buttongoogle);
	}

}
