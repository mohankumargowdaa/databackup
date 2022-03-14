package Spicejet;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFlight_RoundTrip {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		
	
		
		
		
		/*
		 * WebElement element = driver.findElement(By.
		 * xpath("//div[.='Bengaluru']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"
		 * )); ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView(true);", element); Thread.sleep(2000);
		 * ((JavascriptExecutor)
		 * driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		 * Thread.sleep(2000);
		 */
		driver.findElement(By.xpath("//div[.='Bengaluru']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']")).click();
		
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		
			driver.findElement(By.xpath("//div[.='Delhi']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']")).click();
			
//driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2022']/descendant::div[@data-testid='undefined-calendar-day-12']")).click();



//driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2022']/descendant::div[@data-testid='undefined-calendar-day-13']")).click();

	//driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
	
		//driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']/*[name()='svg']")).click();
		
		//driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']/*[name()='svg']")).click();	
		
		//driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']/*[name()='svg']")).click();
		
		//driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
		driver.findElement(By.xpath("//div[.='Currency']")).click();
		
		driver.findElement(By.xpath("//div[.='INR' and @class='css-76zvg2 r-homxoj r-ubezar']")).click();
		
		//driver.findElement(By.xpath("//div[.='Students' and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']/div[@class='css-1dbjc4n']/*[name()='svg']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
		
		//agree and confirmation for Students
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']//*[name()='rect']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73' and @data-focusable='true']")).click();
		Thread.sleep(5000);
		
		
		
		//page 2
		driver.findElement(By.xpath("//div[.='SG 535']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']//div[@data-testid='spicemax-flight-select-radio-button-3']")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[.='SG 534']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']//div[@data-testid='spicesaver-flight-select-radio-button-1']")); 
		js.executeScript("arguments[0].scrollIntoView(true);", element); 
		Thread.sleep(2000);
		element.click();
		
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta' and @data-focusable='true']")).click();
		
		
		
		Thread.sleep(5000);
		//page 3
		driver.findElement(By.xpath("//div[@data-testid='title-contact-detail-card']")).click();
		
		driver.findElement(By.xpath("//div[.='Mr' and @class='css-76zvg2 r-homxoj r-poiln3 r-ubezar']")).click();
		
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Mohankumar");
		
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("Gowda");
		
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("8888888888");
		
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Shivamogga");
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-y3xmzu']//*[name()='rect']")).click();
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//*[name()='rect']")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-17s6mgv r-1wyyakw']")); 
		js.executeScript("arguments[0].scrollIntoView(true);", element1); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta' and @data-focusable='true']")).click();
		Thread.sleep(5000);
		

	}

}
