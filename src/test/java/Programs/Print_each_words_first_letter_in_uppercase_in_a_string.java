package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Print_each_words_first_letter_in_uppercase_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f="";
	  String str="hello i am in hyderabad.";
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)==' ' || str.charAt(i)=='.')
		  {
			  if(i!=str.length()-1)
			  {
				  f=f+str.charAt(i);
				  i=i+1;
				  f=f+Character.toUpperCase(str.charAt(i)); 
			  }
			  else
			  {
				  f=f+str.charAt(i);
			  }
			 
		  }
		  else
		  {
			  f=f+str.charAt(i);
		  }
	  }
		System.out.println(f.substring(0,1).toUpperCase()+f.substring(1));
	}

}
