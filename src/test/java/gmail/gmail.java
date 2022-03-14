package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmail {
	
	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohangowdatesting@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fortesting");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
		
		
//		driver.findElement(By.xpath("//div[@jscontroller='eIu7Db']")).click();
//		driver.findElement(By.xpath("//div[@id=':6n']")).click();
//		driver.findElement(By.xpath("//textarea[@id=':8z']")).sendKeys("india.mohankumar@gmail.com");
//		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
//		driver.findElement(By.xpath("//div[@id=':9n']")).sendKeys("Hi,\r\n\n"
//				+ "This is just a Test mail, Don't reply for this mail.\r\n\n\n"
//				+ "Thanks and Regards \n MohanKumar Gowda");
//		driver.findElement(By.xpath("//div[@id=':87']")).click();
//		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//img[@class='gb_Aa gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Sign out' and @class='wBFtm']")).click();
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}
}
