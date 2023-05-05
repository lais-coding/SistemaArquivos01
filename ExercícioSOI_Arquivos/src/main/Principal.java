package main;

import java.io.IOException;

import controller.ArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		ArquivosController arqCont = new ArquivosController();
	
		String path = "C:\\TEMP";
		
		
		try {
			//arqCont.leDir(path1);
			arqCont.leArquivo(path, "generic_food.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
