package MavenJenkinsIntt23090642.MavenJenkinsIntt23090642;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void test1() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mamidisrisaiteja@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("srisai123");
	driver.findElement(By.id("u_0_b")).click();

}
}
