package project_Amazontest;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import Project1_Amazon.ITestListener_code;
@Listeners(Project1_Amazon.ITestListener_code.class)
public class Launch_Amazon extends ITestListener_code
{   
	//static WebDriver driver;
	@BeforeMethod
	public void launch_amazon()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();	
	}

}
