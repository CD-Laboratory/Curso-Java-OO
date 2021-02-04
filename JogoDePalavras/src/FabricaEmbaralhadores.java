import java.util.Random;

public class FabricaEmbaralhadores {
    private String palavraE;
    private Random r = new Random();
    protected int embaralhador;

    protected String embaralhaPalavra(String palavra) {
		return escolheEmbaralhador(palavra);
	}
    
	private String escolheEmbaralhador(String palavra) {
		int indiceAleatorio = r.nextInt(3);
		
		switch (indiceAleatorio) {
		 case 0:
			Embaralhador emb01 = new Embaralhador01();
			palavraE = emb01.embaralhar(palavra);
			embaralhador = 1;
			break;
		 case  1:
			Embaralhador emb02 = new Embaralhador02();
			palavraE = emb02.embaralhar(palavra);
			embaralhador = 2;
			break;
		 case  2:
			Embaralhador emb03 = new Embaralhador03();
			palavraE = emb03.embaralhar(palavra);
			embaralhador = 3;
			break;
		}
		
		return palavraE;
	}
}
