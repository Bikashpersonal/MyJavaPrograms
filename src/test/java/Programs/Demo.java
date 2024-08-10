package Programs;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		EdgeOptions options = new EdgeOptions();
		//Thread.sleep(2000);
		options.addArguments("--disable-notifications");
		//Thread.sleep(2000);
		options.addArguments("--guest");
		 DesiredCapabilities capabilities =new DesiredCapabilities();
         options.merge(capabilities);
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver(options);
        //WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> items=driver.findElements(By.cssSelector("h4.product-name"));
		String[] itemNames= {"Cucumber","Carrot","Potato"};
		List itemstoselect=Arrays.asList(itemNames);
		for(int i=0;i<items.size();i++)
		{
			String itemName=items.get(i).getText().split(" ")[0];
			System.out.println(itemName);
			if(itemstoselect.contains(itemName))
			{
				driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
			}
		}
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoCode']")));
		driver.findElement(By.xpath("//*[@class='promoCode']")).sendKeys("bikash");
		driver.findElement(By.xpath("//*[text()='Apply']")).click();
		//WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Invalid code ..!']")));
		System.out.println("Execution Done......");
		
	}
	

}
