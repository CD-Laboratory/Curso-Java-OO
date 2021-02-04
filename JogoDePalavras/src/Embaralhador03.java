
public class Embaralhador03 implements Embaralhador{
	private boolean achouPar = false;
	private String elemento;
	
	@Override
	public String embaralhar(String palavra) {
		return emb03(palavra);
	}

	private String emb03(String palavra) {
	   String[] letras = palavra.split("");
	
	   for (int i = 0; i < letras.length - 1; i++) {
	       if (i %2 == 0 || i == 0) {
	        	elemento = letras[i];
	        	letras[i] = letras[i + 1];
	        	letras[i + 1] = elemento;
	        	achouPar = true;
	       } else {
	    	 if (achouPar == false) {
	    	    elemento = letras[i + 1];
	    		letras[i + 1] = letras[i];
	    		letras[i] = elemento; 
	    	 } 		 
	       }
	   }
	     
	   StringBuilder pEmbaralhada = new StringBuilder(palavra.length());
	       
	   for (String k : letras) {
	   		pEmbaralhada.append(k);
	   	}
	   
	   if (pEmbaralhada.toString() == palavra) {
	    	   embaralhar(palavra);
	   }
	   
	   return pEmbaralhada.toString();
	}
}
