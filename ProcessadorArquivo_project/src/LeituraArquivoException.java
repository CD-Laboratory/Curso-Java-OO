import java.io.File;
import java.io.FileNotFoundException;

public class LeituraArquivoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] retornoSplit;
	private String regex = "->" ;
	private int numeroElementos;
	private String resultado;

	public LeituraArquivoException() {
		resultado = "Erro ao abrir o arquivo";
	}
	
	public LeituraArquivoException(File file) {
		if(file.length() == 0) {
			resultado = "Arquivo vazio";
		}
	}
	
	public LeituraArquivoException(String validaLeitura) {
		retornoSplit = validaLeitura.split(regex);	
		numeroElementos = retornoSplit.length;
		
	    for (int i = 0; i < numeroElementos; i++){
		  //System.out.println( retornoSplit[1]);
		  if(retornoSplit[i].equals("")) {
		     resultado = "Formato de arquivo inválido";
		   }
		}
		
	}

	@Override
	public String toString() {
		return resultado;
	}

}
