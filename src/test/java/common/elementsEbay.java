package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import common.Config;

public class elementsEbay {
	
	
	//ELEMENTO INPUT BUSCADOR DE OBJETOS
	public WebElement Input_Search (WebDriver driver) {	
		WebElement input_Search = driver.findElement(By.id("gh-ac"));
		return input_Search;
	}
	
	//ELEMENTO BOTÓN BUSCAR
	public WebElement Boton_Buscar(WebDriver driver) {
		WebElement boton_Buscar = driver.findElement(By.id("gh-btn"));
		return boton_Buscar;
	}
	
	//ELEMENTO CHECK BOX MARCA PUMA
	public WebElement CheckBox_MarcaPuma(WebDriver driver) {
		WebElement checkBox_MarcaPuma = driver.findElement(By.xpath("//input[@aria-label='PUMA']"));
		return checkBox_MarcaPuma;
	}
	
	//ELEMENTO LISTA ESTADO	
	public WebElement Lista_Estado(WebDriver driver) {
		WebElement lista_Estado = driver.findElement(By.xpath("//span[contains(text(),'Estado')]"));
		return lista_Estado;
	}
	
	//ELEMENTO OPCIÓN NUEVO CON DEFECTOS 
	public WebElement Opcion_NuevoConDefectos(WebDriver driver) {
		WebElement opcion_NuevoConDefectos = driver.findElement(By.xpath("//*[@id=\"s0-13-11-5-1[0]-75[1]-14-content-menu\"]/a[4]/span"));
		return opcion_NuevoConDefectos;
	}
		
	//ELEMENTO ETIQUETA RESULTADO
	public WebElement Label_Resultado(WebDriver driver) {
		WebElement label_Resultado = driver.findElement(By.xpath("//h1/span[@class='BOLD'][1]"));
		return label_Resultado;
	}
	
	//ELEMENTO BOTÓN ORDENAR 
	public WebElement Botton_Ordenar(WebDriver driver) {
		WebElement botton_Ordenar = driver.findElement(By.xpath("//a[@_sp='p2351460.m43632.l8280.c2']"));
		return botton_Ordenar;
	}
	
	
	
	
	
	

}
