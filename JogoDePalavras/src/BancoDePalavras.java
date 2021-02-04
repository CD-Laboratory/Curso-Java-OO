import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	private List<String> palavras;
	private String linha;
	private BufferedReader buffRead;
	private Random r;
	private int index;	
  
	protected BancoDePalavras() {
		palavras = new ArrayList<>();
		linha = "";
		r = new Random();
		index = 0;
	}
	
    protected String pegaPalavra(String path) {
    	leitor(path);
		return palavraSort();
    }
 
	private void leitor(String path) {
		try {
			buffRead = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        while (true) {
            if (linha != null) {
            	if (linha != "") {
            		palavras.add(linha);
            	}
            } else
                break;
            try {
				linha = buffRead.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        try {
			buffRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
  	private String palavraSort() {	
		index = palavras.size() - 1;
	    int i = r.nextInt(index);
	    return palavras.get(i);
  	}
}
