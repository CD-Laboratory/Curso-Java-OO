
public interface MecanicaDoJogo {
	void regrasBasicas();
    int numPalavras();
    int numTentativvas();
    boolean acertos();
	String palavraDoBancoDados();
	String palavraEmbaralhada();
	void resposta(String resp);
	void fimJogo();
	void continuarJogando();
	void validPontos (boolean validTentativa);
}
