package face;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Book {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Venkatsai1.erram@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();



		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Venkatsai");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Erram");
		//driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Venkatsai123");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("venkatsai1");
		driver.findElement(By.id("days")).sendKeys("21");
		driver.findElement(By.id("months")).sendKeys("march");
		driver.findElement(By.id("years")).sendKeys("1996");


		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("2-6-62");

		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Durgacolony");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Caroloina");
		driver.findElement(By.xpath("//select[@id='id_state']")).sendKeys("Arizona");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		driver.findElement(By.xpath("//select[@id='id_country']")).sendKeys("United States");
		driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Please handover the courier to watchman");
		driver.findElement(By.id("phone")).sendKeys("8074475262");
		driver.findElement(By.id("phone_mobile")).sendKeys("9121234563");

		driver.findElement(By.cssSelector("input#alias")).sendKeys("2-6-62,Durga colony,Arizona");
		driver.findElement(By.id("submitAccount")).click();

		driver.findElement(By.linkText("Women")).click();
		//driver.findElement(By.linkText("T-shirts")).click();
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		driver.findElement(By.id("layer_cart"));
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout' and @class='button btn btn-default standard-checkout button-medium']")).click();
		driver.findElement(By.id("email")).sendKeys("Venkatsai1.Erram@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("venkatsai1");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//button[@type='submit'and@name='processAddress']")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//button[@type='submit'and@name='processCarrier']")).click();

		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		driver.findElement(By.xpath("//button[@type='submit'and@class='button btn btn-default button-medium']")).click();
		System.out.println("product successfully purchased");



		driver.findElement(By.linkText("Pay by check ")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @class='button btn btn-default button-medium']")).click();



	}

}


