package Tests;

import org.junit.Test;

import common.Base;
import common.Utils;
import common.elementsEbay;



public class TestSearchShoes extends Base {

	@Test
	public void test() throws InterruptedException {
		
		Utils utils = new Utils();
		elementsEbay elements = new elementsEbay();
		
		//Clic en el Inpunt para la búsqueda de los zapatos
		utils.click(elements.Input_Search(driver));
		
		//Captura de "Zapatos" en el input de búsqueda
		utils.LimpiarYLLenarInput(elements.Input_Search(driver), "zapatos");
		Thread.sleep(2000);
		
		//Clic en el botón Buscar 
		utils.click(elements.Boton_Buscar(driver));
		Thread.sleep(2000);
		
		//Clic en el Check Box "Puma"
		utils.click(elements.CheckBox_MarcaPuma(driver));
		Thread.sleep(4000);
		
		//Clic en el combo / menú "Estado"
		utils.click(elements.Lista_Estado(driver));
		Thread.sleep(2000);
		
		//Se selecciona la opción "Nuevo con Defectos"
		utils.click(elements.Opcion_NuevoConDefectos(driver));
		Thread.sleep(5000);
		
		//Se imprime el resultado del total de los tenis "Nuevo Con Defectos"
		System.out.println("Tenis Puma Nuevo Con Defectos:" + elements.Label_Resultado(driver).getText());
		
		//Se selecciona el botón ordenar por precio
		utils.click(elements.Botton_Ordenar(driver));
		Thread.sleep(5000);
		
		//Se imprime el resultado por precio
		System.out.println("Tenis Ordenados Por Precio:" + elements.Label_Resultado(driver).getText());
	}

}
