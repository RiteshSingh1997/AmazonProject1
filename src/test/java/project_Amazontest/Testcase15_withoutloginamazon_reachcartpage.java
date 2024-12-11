package project_Amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Homepage;

public class Testcase15_withoutloginamazon_reachcartpage extends Launch_Amazon
{   
	@Test
	public void Reachaddtocart() throws InterruptedException
	{   
	Homepage h1 = new Homepage(driver);
	h1.searchfield();
    Thread.sleep(2000);
    h1.firstshoe();
    Thread.sleep(3000);
    h1.addtocart(driver);
    Thread.sleep(2000);
    h1.Gotocart();
    WebElement deleteproductaddedtocart = driver.findElement(By.xpath("//span[@class='a-size-small sc-action-delete']"));
    Assert.assertEquals(deleteproductaddedtocart.isDisplayed(), true);
	
	}

}
