import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteEmbaralhamento {

	BancoDePalavras bancoPalavras = new BancoDePalavras();
	String palavraArquivo; 
	FabricaEmbaralhadores palavraEmbaralhada = new FabricaEmbaralhadores();
	
	@Test
	void testFabricaDeEmbaralhar() {
		palavraArquivo = bancoPalavras.pegaPalavra("/D:/Users/Dell/eclipse-workspace/JogoDePalavras/arquivo01.txt");
		
		System.out.println("========================================================================");
		System.out.println("Palavra original - " + palavraArquivo);
		System.out.println("Teste Fabica De Embaralhadores: " + palavraEmbaralhada.embaralhaPalavra(palavraArquivo));
		System.out.println("O embaralhador utilizado foi o - " + palavraEmbaralhada.embaralhador);
		System.out.println("========================================================================");
	}

	@Test
	void testEmbaralhador01() {
		palavraArquivo = bancoPalavras.pegaPalavra("/D:/Users/Dell/eclipse-workspace/JogoDePalavras/arquivo01.txt");
	
		Embaralhador emb01 = new Embaralhador01();
		String palavraE01 = emb01.embaralhar(palavraArquivo);

		System.out.println("========================================================================");
		System.out.println("Palavra original - " + palavraArquivo);
		System.out.println("Palavra embaralhada (01) - " + palavraE01);
		System.out.println("========================================================================");
	}
	
	@Test
	void testEmbaralhador02() {
		palavraArquivo = bancoPalavras.pegaPalavra("/D:/Users/Dell/eclipse-workspace/JogoDePalavras/arquivo01.txt");
		
		Embaralhador emb02 = new Embaralhador02();
		String palavraE02 = emb02.embaralhar(palavraArquivo);

		System.out.println("========================================================================");
		System.out.println("Palavra original - " + palavraArquivo);
		System.out.println("Palavra embaralhada (02) - " + palavraE02);
		System.out.println("========================================================================");
	}
	
	@Test
	void testEmbaralhador03() {
		palavraArquivo = bancoPalavras.pegaPalavra("/D:/Users/Dell/eclipse-workspace/JogoDePalavras/arquivo01.txt");

		Embaralhador emb03 = new Embaralhador03();
		String palavraE03 = emb03.embaralhar(palavraArquivo);

		System.out.println("========================================================================");
		System.out.println("Palavra original - " + palavraArquivo);
		System.out.println("Palavra embaralhada (03) - " + palavraE03);
		System.out.println("========================================================================");
	}
}
