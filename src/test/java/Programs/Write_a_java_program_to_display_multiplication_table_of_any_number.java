package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Write_a_java_program_to_display_multiplication_table_of_any_number {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=0;
		for(int i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(n+" * "+i+"="+a);
		}

	}

}
