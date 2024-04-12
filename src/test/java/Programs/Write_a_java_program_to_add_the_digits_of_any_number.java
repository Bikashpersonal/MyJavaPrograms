package Programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Write_a_java_program_to_add_the_digits_of_any_number {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		int n=123456;
		
		int rem=0;	
		int sum=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);
		
	}

}
