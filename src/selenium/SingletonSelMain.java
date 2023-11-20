package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class SingletonSelMain {

	public static void main(String[] args) throws InterruptedException {
	
		int selectBrowser = 0;
		System.out.println("Select Browser:\n1. Chrome\n2. Firefox\n3. Internet Explorer\nYour Choice: ");
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
		case 1:
			selectBrowser = 1; 
			break;
		case 2:
			selectBrowser = 2; 
			break;
		case 3:
			selectBrowser = 3; 
			break;
		default:
			System.out.println("Invalid option..");
			break;
		}
		
		WebDriver dvr = SingletonSelenium.getInstance(selectBrowser);
		dvr.get("https://www.google.com/");
		System.out.println("dvr: Pointing to -> "+dvr);
		Thread.sleep(2000);
		
		WebDriver driver = SingletonSelenium.getInstance(selectBrowser);
		driver.navigate().to("https://www.ibn.co.in/");
		Thread.sleep(2000);
		//driver.get("https://www.ibn.co.in/");
		System.out.println("driver: Pointing to -> "+driver);

		WebDriver drvClose = SingletonSelenium.getInstance(selectBrowser);
		System.out.println("drvClose: Pointing to -> "+drvClose);

		drvClose.quit();
		System.out.println("drvClose: Pointing to -> "+drvClose);
		sc.close();
		
	}

}
