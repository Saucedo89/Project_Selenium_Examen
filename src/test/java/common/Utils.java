package common;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import common.elementsEbay;



public class Utils {
	
	private WebDriver driver;
	
	elementsEbay elements = new elementsEbay();
	
	
	

	public WebElement findElement (By locator) {
		return driver.findElement(locator);		
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click (WebElement elemento) {
		elemento.click();
	}
	
	 public void LimpiarInput(WebElement elemento)
     {
         elemento.clear();;
     }
	
	public void LimpiarYLLenarInput(WebElement input, String texto)
    {
        LimpiarInput(input);
        input.sendKeys(texto);

        
    }
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
			
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visitURL (String  url) {
		driver.get(url);
	}
	
	


	
	

}
