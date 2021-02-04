import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner escolheJogo = new Scanner(System.in);
		FabricaMecanicaDoJogo fbjogo = new FabricaMecanicaDoJogo();	
		int numJogo;
		
		System.out.println("====================================================");
		System.out.println("=                JOGO DE PALAVRAS                  =");
		System.out.println("====================================================");
		System.out.println("=  Escolha o jogo:                                 =");
		System.out.println("=  1.Adivinhe os nomes de comidas                  =");
		System.out.println("=  2.Adivinhe os nomes dos animais                 =");
		System.out.println("=  3.Adivinhe os nomes das profissoes                =");
		System.out.println("=  4.Adivinhe as palavras                          =");
		System.out.println("====================================================");
		System.out.println("=    Insira o número do jogo que deseja jogar      =");
		System.out.println("=       (só serão aceitos números de 1 a 4)        =");
		System.out.println("====================================================");	
				
		numJogo = escolheJogo.nextInt();	
	
		fbjogo.escolherJogo(numJogo);
		
		while (fbjogo.opJogo == false) {
		  System.out.println("Escolha o número do jogo corretamente ");
		  numJogo = escolheJogo.nextInt();
		  fbjogo.escolherJogo(numJogo);
		}
		
		//Comecar a jogar
		
		fbjogo.jogar();
		
		escolheJogo.close();		

	}
}