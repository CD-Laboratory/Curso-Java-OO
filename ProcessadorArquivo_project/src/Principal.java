import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessadorArquivo procArquivo = new ProcessadorArquivo();
		Map<Integer, String> mapaDados = new HashMap<Integer, String>();
		
		mapaDados = procArquivo.processar("arquivo01.txt");
		
		 for(Integer valor : mapaDados.keySet()){
		      System.out.println(valor + " " + mapaDados.get(valor));
		    }
		
	}

}
