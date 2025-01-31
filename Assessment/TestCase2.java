package week2.Assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeBrowser
				ChromeDriver driver=new ChromeDriver();

				//Loading the URL -get
				driver.get("https://www.amazon.in/");
				driver.navigate().refresh();
				//Maximize the browser
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
			     driver.findElement(By.id("nav-search-submit-button")).click();
			     //get the number of results
			  String total=    driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
			 //print the number of results
			 System.out.println(total+"bags");
			 
			 //select first brand
			 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
			 //se;ect the sec brand
			 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
			 
			 //select the Featured dropdown
			 driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
			 //select new arraivels
			 driver.findElement(By.linkText("Newest Arrivals")).click();
			 Thread.sleep(1000);
			 //get the name of the bag
			 WebElement element = driver.findElement(By.xpath(("(//h2[@class='a-size-mini s-line-clamp-1'])[1]")));
			 
			 //print the bag name in console
			 System.out.println("bag name is: "+element.getText());
			 
			 //first 2 Elements
			 List<WebElement> elements = driver.findElements(By.xpath("//a//h2//span"));
			 
			 String firstProduct=elements.get(1).getText();
			 String secProduct=elements.get(2).getText();
			 
			 System.out.println("First Product: "+firstProduct);
			 System.out.println("Second Product: "+secProduct);
			 //first 2 prices
			 List<WebElement> elements2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			 
			 String price1=elements2.get(1).getText();
			 String price2=elements2.get(2).getText();
			 
			 System.out.println("First Product Price: "+price1);
			 System.out.println("Second Product Price: "+price2);
			 System.out.println("Tittle: "+driver.getTitle());
			 
	}

}
