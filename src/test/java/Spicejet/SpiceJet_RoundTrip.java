package Spicejet;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet_RoundTrip {

	public static void main(String[] args) throws Throwable {
		String rideType="round-trip"; //"one-way"
		String orginPlace="Goa";
		String destinationPlace="Delhi";
		String[] departureDate= {"day-12","March-2022"};
		String[] returnDate= {"day-13","March-2022"};
		String departureFlight="SG 535";
		String returnFlight="SG 534";
		String[] flightFares={"spicesaver-flight-select-radio-button-1","spicemax-flight-select-radio-button-3"};
		String spicesaverFare=flightFares[0];
		String spiceMaxFare=flightFares[1];
		String[] contactDetails= {"Mr","Mohankumar","gowda","8888000080","abc@gmail.com","Shivamogga"};

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@data-testid='"+rideType+"-radio-button']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		driver.findElement(By.xpath("//div[.='"+orginPlace+"']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		driver.findElement(By.xpath("//div[.='"+destinationPlace+"']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+departureDate[1]+"']/descendant::div[@data-testid='undefined-calendar-"+departureDate[0]+"']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+returnDate[1]+"']/descendant::div[@data-testid='undefined-calendar-"+returnDate[0]+"']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(5000);



		//page 2
		driver.findElement(By.xpath("//div[.='"+departureFlight+"']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']//div[@data-testid='"+spicesaverFare+"']")).click();
		WebElement element = driver.findElement(By.xpath("//div[.='"+returnFlight+"']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']//div[@data-testid='"+spiceMaxFare+"']")); 
		js.executeScript("arguments[0].scrollIntoView(true);", element); 
		Thread.sleep(2000);
		element.click();
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta' and @data-focusable='true']")).click();
		Thread.sleep(5000);

		
		//page 3
		driver.findElement(By.xpath("//div[@data-testid='title-contact-detail-card']")).click();
		driver.findElement(By.xpath("//div[.='"+contactDetails[0]+"' and @class='css-76zvg2 r-homxoj r-poiln3 r-ubezar']")).click();
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys(contactDetails[1]);
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys(contactDetails[2]);
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys(contactDetails[3]);
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys(contactDetails[4]);
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys(contactDetails[5]);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-y3xmzu']//*[name()='rect']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//*[name()='rect']")).click();
		WebElement element1 = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-17s6mgv r-1wyyakw']")); 
		js.executeScript("arguments[0].scrollIntoView(true);", element1); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta' and @data-focusable='true']")).click();
		Thread.sleep(5000);
	}
}
