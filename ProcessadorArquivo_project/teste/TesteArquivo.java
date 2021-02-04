import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class TesteArquivo {

	@Test
	void testSucesso() {
		ProcessadorArquivo procArquivo = new ProcessadorArquivo();
		Map<Integer, String> mapaDados = new HashMap<Integer, String>();
		
		mapaDados = procArquivo.processar("arquivo01.txt");
		
		 for(Integer valor : mapaDados.keySet()){
		      System.out.println(valor + " " + mapaDados.get(valor));
		 }
	}

	@Test
	void testArquiInvalido() {
		ProcessadorArquivo procArquivo = new ProcessadorArquivo();
		Map<Integer, String> mapaDados = new HashMap<Integer, String>();
		
		mapaDados = procArquivo.processar("arquivo02.txt");
		
		 for(Integer valor : mapaDados.keySet()){
		      System.out.println(valor + " " + mapaDados.get(valor));
		 }
	}

	@Test
	void testArquiVazio() {
		ProcessadorArquivo procArquivo = new ProcessadorArquivo();
		Map<Integer, String> mapaDados = new HashMap<Integer, String>();
		
		mapaDados = procArquivo.processar("arquivo03.txt");
		
		 for(Integer valor : mapaDados.keySet()){
		      System.out.println(valor + " " + mapaDados.get(valor));
		 }
	}
	
	@Test
	void testArquErro() {
		ProcessadorArquivo procArquivo = new ProcessadorArquivo();
		Map<Integer, String> mapaDados = new HashMap<Integer, String>();
		
		mapaDados = procArquivo.processar("arquivo.txt");
		
		 for(Integer valor : mapaDados.keySet()){
		      System.out.println(valor + " " + mapaDados.get(valor));
		 }
	}
}
