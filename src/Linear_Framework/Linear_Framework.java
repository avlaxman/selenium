package Linear_Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class Linear_Framework {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	        //Login
	        driver.navigate().to("http://newtours.demoaut.com/");
	        driver.findElement(By.name("userName")).sendKeys("Mercury");
	        driver.findElement(By.name("password")).sendKeys("mercury");
	        driver.findElement(By.name("login")).click();
	         //Book a Ticket
	     Select Passangers= new Select(driver.findElement(By.cssSelector("select[name='passCount']")));
	        Passangers.selectByVisibleText("2");
	        Select Departingfrom = new Select(driver.findElement(By.cssSelector("select[name='fromPort']")));
	        Departingfrom.selectByVisibleText("Frankfurt");
	        Select FromMonth = new Select(driver.findElement(By.cssSelector("select[name='fromMonth']")));
	        FromMonth.selectByVisibleText("September");
	        Select ArrivingIn = new Select(driver.findElement(By.cssSelector("select[name='toPort']")));
	        ArrivingIn.selectByVisibleText("New York");
	        Select ToMonth = new Select(driver.findElement(By.cssSelector("select[name='toMonth']")));
	        ToMonth.selectByIndex(10);
	        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input")).click();
	        driver.findElement(By.name("findFlights")).click();
	        driver.findElement(By.name("reserveFlights")).click();
	        driver.findElement(By.name("passFirst0")).sendKeys("Name1");
	        driver.findElement(By.name("passLast0")).sendKeys("LastName");
	        driver.findElement(By.name("creditnumber")).sendKeys("1234566");
	        driver.findElement(By.name("buyFlights")).click();
	             
	      
	         //Logout
	        driver.findElement(By.linkText("SIGN-OFF")).click();
	        System.out.println("Success");
	        
	        
	     //Close Browser
	        driver.quit();
	        
	        
	}

}
