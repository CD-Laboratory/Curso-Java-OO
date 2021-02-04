import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	static File file;
	static Scanner sc;
	static String validTexto;
	static String[] retornoSplit;
	static int numeroElementos;
	static int j;
	static String regex = "->", index ;
	static Map<Integer, String> mapaDados = new HashMap<Integer, String>();

	public static Map  processar(String path) {
		file = new File(path);
		try {
			if (file.length() == 0) {
				throw new LeituraArquivoException(file);
			}
			
		} catch (LeituraArquivoException e){
			e.toString();
			e.printStackTrace();
		}
		try {
			sc = new Scanner(file);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				e.printStackTrace();
				throw new LeituraArquivoException(); 
			} catch (LeituraArquivoException f) {
				f.toString();
				f.printStackTrace();
			}			
		} 
		passarValor();
		return mapaDados;
	}
	
	public static void passarValor() {
		if (file.length() != 0)
			while (sc.hasNextLine()){
				String s = sc.nextLine();
				
				retornoSplit = s.split(regex);	
				numeroElementos = retornoSplit.length;
		
				try {
					for (int i = 0; i < numeroElementos; i++){
						//System.out.println( retornoSplit[1]);
						if(retornoSplit[i].equals("")) {
							throw new LeituraArquivoException(s); 
						} 
					}
				} catch (LeituraArquivoException e) {
					// TODO Auto-generated catch block
					e.toString();
					e.printStackTrace();
				} 

				mapaDados.put(j, s);
				
				j++;
				//trabalha com os dados da linha
			}
	}
	
}
