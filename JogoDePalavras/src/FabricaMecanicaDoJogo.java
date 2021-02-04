import java.util.Scanner;

public class FabricaMecanicaDoJogo {

	private  MecanicaDoJogo jogo;
	private Scanner dado = new Scanner(System.in);
	private Scanner validJogo = new Scanner(System.in);
	private int k = 0, j = 0, i = 0;
	private String resp, contJogo;
	protected boolean opJogo = true, validPergunta = false, validPergunta2 = false;

	protected void escolherJogo(int numJogo) {
		switch (numJogo) {
			case 1:
				jogo = new JogoAdivinheAsFrutas();
				jogo.regrasBasicas();
				opJogo = true;
				break;
			case 2:
				jogo = new JogoAdivinheOsAnimais();
				jogo.regrasBasicas();
				opJogo = true;
				break;
			case 3:
				jogo = new JogoAdivinheAProfissao();
				jogo.regrasBasicas();
				opJogo = true;
				break;
			case 4:
				jogo = new JogoAdivinhePalavrasAleatorias();
				jogo.regrasBasicas();
				opJogo = true;
				break;
			default:
				System.out.println("Opção errada: ");
				opJogo = false;		
				break;
		}	
	}

	public void jogar() {
		montarJogo();
	}
	
	private void montarJogo() {
	    for (i = 0; i < jogo.numPalavras(); i++) {      	
	    	validaPalavra();
	    	validaResp();
	    	
	    	if(jogo.acertos() == false) {
	    	  validaAcertos();
	    	  jogo.validPontos(false);
	    	} else {
	    		jogo.validPontos(false);
	    	}
	    	
            if(i >= (jogo.numPalavras()/2)) {
                if (validPergunta == false) {
            	    continuarJogando();
            	    validPergunta = true;
            		
            		if(contJogo.equals("S") || contJogo.equals("s")) {
            			continue;
            		} else {
            			break;
            		}
            	}
            }
        }
	    
	    jogo.fimJogo();	    
	    dado.close();
	    validJogo.close();
	}
	
	private void validaPalavra() {
        System.out.println(jogo.palavraDoBancoDados());
        System.out.println("============================");
        System.out.println("===  Que palavra é esta? ===");	
        System.out.println("============================");
        System.out.println(jogo.palavraEmbaralhada());	
	}
	
	private void validaResp() {
      	System.out.println("Insira a palavra: ");
      	resp = dado.nextLine();	
      	jogo.resposta(resp);	
	}
	
	private void validaAcertos() {
  		for (j = 0; j < jogo.numTentativvas(); j++) {
		   if (jogo.acertos() == false) {
			  jogo.validPontos(true);
      		  System.out.println("Tente novamente : ");
      		  System.out.println("Tentativa " + ++k);
          	  resp = dado.nextLine();	 
          	  jogo.resposta(resp);  
      		} else {
      			k = 0;
      			validaPalavra();
      			break;
      		}
      	}
	    k = 0;
	}
	
	private void continuarJogando() {
		jogo.continuarJogando();
		contJogo = validJogo.nextLine();
		
		while(validPergunta2 == false) {
			if(contJogo.equalsIgnoreCase("S") || contJogo.equalsIgnoreCase("N")){
				validPergunta2 = true;
			} else {
				System.out.println("Opção invlálida"); 
				jogo.continuarJogando();
				contJogo = validJogo.nextLine();
			}
		}
	}
}
