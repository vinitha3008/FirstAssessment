package week2.Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeBrowser
		ChromeDriver driver=new ChromeDriver();

		//Loading the URL -get
		driver.get("https://www.pvrcinemas.com/");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	     
	     //in search box chennai 
	    driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//h6[text()='Chennai'])")).click();
	     
	     //click on cinema
	     driver.findElement(By.xpath("//div[@class='date-show']//span[2]")).click();
	     
	     //select dropdown box
	     driver.findElement(By.xpath("//span[contains(text(),'Select')]")).click();
	    
	     //select the 2nd list
	     driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[2]")).click();
	     //select date element
	     //driver.findElement(By.id("date")).click();
	     Thread.sleep(2000);
	     //select the date from the dropdown
	     driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li")).click();
	  
	     //select cinema box
	    // driver.findElement(By.id("cinema")).click();
	     Thread.sleep(2000);
	     //select one cinema from the list
	     driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
	     Thread.sleep(2000);
	     //select the timing
	     driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[2]")).click();
	     
	     //click on book button
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(2000);
	     //Select the seat number
	     driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[18]")).click();
	     
	     //click on proceed button
	     driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	     
	     //click on proceed button
	     driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	     
	     System.out.println("current page tittle:"+driver.getTitle());
	     driver.close();
	     
	}
	

}
