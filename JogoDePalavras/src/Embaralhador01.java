import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Embaralhador01 implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
		return emb01(palavra);
	}
	
	private String emb01(String palavra) {
	   List<String> letras = Arrays.asList(palavra.split(""));
	   Collections.shuffle(letras);
	   StringBuilder pEmbaralhada = new StringBuilder(palavra.length());

	   for (String k : letras) {
	   	  pEmbaralhada.append(k);
	   }
	   
	   return pEmbaralhada.toString();
	}	

}
