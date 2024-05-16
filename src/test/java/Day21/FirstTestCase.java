package Day21;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
