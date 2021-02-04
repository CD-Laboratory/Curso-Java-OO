
public class JogoAdivinheAProfissao implements MecanicaDoJogo {
	private String palavraArquivo;
	private	int ponto = 0;
	private	final int chancesPalavra = 2, quantidadePavalavras = 30;
	private	boolean acertou;
	private	BancoDePalavras bancoPalavras = new BancoDePalavras();
	private	FabricaEmbaralhadores palavraEmbaralhada = new FabricaEmbaralhadores();

	
	private String pegarPalavra() {
		palavraArquivo = bancoPalavras.pegaPalavra("/D:/Users/Dell/eclipse-workspace/JogoDePalavras/arquivo03.txt");
		return palavraArquivo;
	}

	private String embaralharPalavra() {
		return palavraEmbaralhada.embaralhaPalavra(palavraArquivo);
	}
	
	private void lerResposta(String resp) {
		if (resp.equalsIgnoreCase(palavraArquivo)) {
			System.out.println("Correto!");
			pontuacao();
			acertou = true;
		} else {
			System.out.println("Errou!");
			acertou = false;
		}
	}
	
	private int pontuacao() {
		return ++ponto;
	}
	
	private void fimGame() {
		if (ponto >= (quantidadePavalavras/2)) {
			System.out.println("===================================================");
			System.out.println("Fim de jogo !!...");
			System.out.println("Ganhador XD !!...");
			System.out.println("Voc� comclu�o o jogo com " + ponto + " ponto(s)");	
			System.out.println("===================================================");
		} else {
			System.out.println("===================================================");
			System.out.println("Fim de jogo !!...");
			System.out.println("Pena voc� perdeu :c ");		
			System.out.println("Voc� comclu�o o jogo com " + ponto + " ponto(s)");		
			System.out.println("===================================================");
		}
	}

	private void validaContinuarJogo() {
		if (ponto >= (quantidadePavalavras/2)) {
			System.out.println("===================================================");
			System.out.println("Pontua��o m�nima para vencer atingida !!...");
			System.out.println("Deseja Continuar? (S - Sim / N - N�o) ");
			System.out.println("===================================================");
		} else {
			System.out.println("===================================================");
			System.out.println("Deseja Continuar? (S - Sim / N - N�o) ");			
			System.out.println("===================================================");
		}
	}
	
	private void validPontuacao (boolean validTentativa) {
		if (validTentativa) {
			System.out.println("===================================================");
			System.out.println("Voc� tem - " + ponto + " ponto(s) !");
			System.out.println("===================================================");
		} else {
			System.out.println("===================================================");
			System.out.println("A palavra significa - " + palavraArquivo);
			System.out.println("Voc� tem - " + ponto + " ponto(s) !");
			System.out.println("===================================================");
		}
	}
	
	@Override
	public String palavraDoBancoDados() {
		// TODO Auto-generated method stub
		return pegarPalavra();
	}

	@Override
	public String palavraEmbaralhada() {
		// TODO Auto-generated method stub
		return embaralharPalavra();
	}

	@Override
	public void resposta(String resp) {
		// TODO Auto-generated method stub
		lerResposta(resp);
	}

	@Override
	public void fimJogo() {
		// TODO Auto-generated method stub
		fimGame();
	}

	@Override
	public int numPalavras() {
		// TODO Auto-generated method stub
		return quantidadePavalavras;
	}

	@Override
	public int numTentativvas() {
		// TODO Auto-generated method stub
		return chancesPalavra;
	}

	@Override
	public boolean acertos() {
		// TODO Auto-generated method stub
		return acertou;
	}

	@Override
	public void continuarJogando() {
		// TODO Auto-generated method stub
		validaContinuarJogo();
	}

	@Override
	public void regrasBasicas() {
		System.out.println("==                                                ==");
		System.out.println("====================================================");
		System.out.println("=                JOGO DE PALAVRAS                  =");
		System.out.println("=           Adivinhe os nomes das profiss�es       =");
		System.out.println("====================================================");
		System.out.println("=  Regras:                                         =");
		System.out.println("=  1. As palavras embraralhadas ir�o aparecer na   =");
		System.out.println("=     tela e voc� deve adivinhar qual o nome       =");
		System.out.println("=     corresponde a profiss�o apresentada          =");
		System.out.println("=  2. Ser�o apresentadas 30 tipos de profiss�es    =");
		System.out.println("=     diferentes                                   =");
		System.out.println("=  3. Para ganhar voc� deve acertar 15 delas       =");
		System.out.println("=  4. Caso erre, voc� ter� duas tentativa por      =");
		System.out.println("=     cada palavra                                 =");
		System.out.println("====================================================");
		System.out.println("=                   BOA SORTE !!!                  =");
		System.out.println("====================================================");	
		System.out.println("==                                                ==");
	}

	@Override
	public void validPontos(boolean validTentativa) {
		// TODO Auto-generated method stub
		validPontuacao (validTentativa);
	}
}
