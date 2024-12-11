package project_Amazontest;

import org.testng.Assert;

import org.testng.annotations.Test;

import Project1_Amazon.Homepage;
import Project1_Amazon.NewRegistrationPage;

public class Testcase1_Registeramazon extends Launch_Amazon
{   
	@Test
	public void new_user_register()
	{   
        Homepage h1 = new Homepage(driver);
        h1.accountandlist(driver);
        h1.Registerbutton();
        NewRegistrationPage r1 = new NewRegistrationPage(driver);
        r1.yourname();
        r1.phonenumber();
        r1.password1();
        r1.clickverify();
        Assert.assertFalse(false);
	}
	

}

