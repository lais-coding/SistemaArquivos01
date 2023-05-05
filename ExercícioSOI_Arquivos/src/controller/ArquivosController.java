package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController {
	
	public ArquivosController() {
		super();
	}
	
	
	//Acesso no diretório
	
	public void leDir(String path) throws IOException {
		
		File dir = new File(path);
		
		//1) Verificar a existência do diretório e do arquivo
		
		
		if(dir.isDirectory() && dir.exists()) {
			
			File[] vetFiles = dir.listFiles(); //listFiles retorna um array de Strings que referencia os nomes dos arquivos e diretórios contidos no diretório que passei como parâmetro
		
					for(File f : vetFiles) {
						if(f.isDirectory()) {
							System.out.println("<DIR> " +f.getName()); //Retorna o nome do arquivo ou diretório
						} else {
							System.out.println(" " +f.getName()); 
						}
					}
		}
		
		}
		
		//2) Ler o arquivo, executar a separação e exibir no Console
		
		public void leArquivo(String path, String arquivo) throws IOException {
			
			File arq = new File (path, arquivo);
			
			
			//Se existir e for arquivo...
			
			if(arq.exists() && arq.isFile()) {
				
				
				FileInputStream abreFluxoArq = new FileInputStream(arq);
				InputStreamReader leitorFluxo = new InputStreamReader(abreFluxoArq);
				BufferedReader buffer = new BufferedReader(leitorFluxo);
				
				String linha = buffer.readLine();
				
				while(linha != null) {
					
					String [] vetLinha = linha.split(",");
					
					if(linha.contains("Fruits")) {
						System.out.println(vetLinha[0] + "\t\t " + vetLinha[1] + "\t\t" + vetLinha[3]);
						System.out.println("\n");
						System.out.println("----------------------------------------------------------------");
						System.out.println("\n");
						
					}
						
					linha = buffer.readLine();
					
					
				}
				
				buffer.close();
				leitorFluxo.close();
				abreFluxoArq.close();
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	
	

	
	
	
	
}
