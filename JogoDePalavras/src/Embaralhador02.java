import java.util.Random;

public class Embaralhador02 implements Embaralhador{
	private Random r = new Random();
	
	@Override
	public String embaralhar(String palavra) {
		return emb02(palavra);
	}

	private String emb02(String palavra) {
		String[] letras = palavra.split("");
	    
	    for (int i = letras.length; i > 0; i--) {
	       int indiceAleatorio = r.nextInt(i);
		   String elemento = letras[i - 1];
		   letras[i - 1] = letras[indiceAleatorio];
		   letras[indiceAleatorio] = elemento;
	    }
	    
	    StringBuilder pEmbaralhada = new StringBuilder(palavra.length());
	    
	    for (String k : letras) {
	       pEmbaralhada.append(k);
	    }
	       
	    if (pEmbaralhada.toString() == palavra) {
	       emb02(palavra);
	    }
	
	    return pEmbaralhada.toString();
	}
}
