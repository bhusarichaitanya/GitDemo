package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		
//		boolean fieldTopGainers = driver.findElement(By.xpath("//div[text()=\"Top Gainers\"]")).isDisplayed();
//		if(fieldTopGainers == true) {
//			System.out.println("Page is displayed");
//		}else 
//		{
//			System.out.println("Page is not displaed");
//		}
		//self 
		String text = driver.findElement(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/self::a")).getText();
		System.out.println(text);
		
		//parent 
		String ptext = driver.findElement(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/parent::td")).getText();
		System.out.println(ptext);
		
		//child
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr/child::td"));
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
		}
		
		//Ancestor
		String textAncestor = driver.findElement(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr")).getText();
		System.out.println(textAncestor);
		
		//Descendant 
		List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr/descendant::td"));
		System.out.println("Number of descendants nodes = "+descendants.size());
		
		
		//following 
		List<WebElement> followings = driver.findElements(By.xpath("//a[contains(text(),\\\"Ramco Systems Lt\\\")]/ancestor::tr/following::tr"));
		System.out.println("following elements size = "+followings);
		
		//following-sibling 
		List<WebElement> following_sibling = driver.findElements(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr/following-sibling::tr"));
		System.out.println("Following sibling "+following_sibling.size());
		
		//Preceding 
		List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr/preceding::tr"));
		System.out.println("Preceding size "+precedings);
		//Preceding-sibling 
		WebElement preceding_sibling = driver.findElement(By.xpath("//a[contains(text(),\"Ramco Systems Lt\")]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Preceding size "+preceding_sibling);
		
		driver.close();
	}

}
