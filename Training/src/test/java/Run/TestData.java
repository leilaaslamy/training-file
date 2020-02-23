package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.browsers;

import org.testng.annotations.DataProvider;

public class TestData extends browsers
{
  @Test(dataProvider = "signin")
  public void f(Integer n, String s) {
	  Home h=new Home(driver);
	   
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "shahbaz@gmail", "a" },
      new Object[] { "zoha@gmail.com", "b" },
      new Object[] { "payman@gmail.com", "c"}
    };
     
      
      
    }
  
}
    

