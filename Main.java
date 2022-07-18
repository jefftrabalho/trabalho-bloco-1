package br.com.gen.projeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		//variaveis e classe Scanner
		int t = 1, d = 0;
		int contribuicao = 0 ;
		Scanner input = new Scanner(System.in);
		
		//do-while do programa
		do {
			System.out.println("\n===================================================================");
			System.out.println("=                       LAR PARA TODOS                /)-/)       =");
			System.out.println("=                 Seu novo companheirinho esta aqui  (>^.^<)      =");
			System.out.println("===================================================================");
			

			System.out.println("\nOla, bem vinde ao Lar para todos! \nDigite '0' para sair.");
			System.out.println("\nComo voce gostaria de contribuir? \nDigite 1 - Adocao; 2 - Doacao; 3 - Lar Temporario; 4 - Trabalhe Conosco; 5 - Denuncia." );
			contribuicao = input.nextInt(); 
			
			
			switch (contribuicao) {
			case 1: //laco adocao
				
				System.out.println("Insira seu nome:");
				String nome = input.next();
				System.out.println("Voce gostaria de adotar um ? Digite 1 - cachorro;  2 - gato");
				int animal = input.nextInt(); 
				System.out.println("Qual seu tipo de moradia ? Digite 1 - apartamento; 2 - casa");
				int moradia = input.nextInt();
				System.out.println("Voce prefere um animal? Digite 1 - filhote; 2 - adulto");
				int filhoteAdulto = input.nextInt();
				
				Adocao ad = new Adocao(nome, moradia, filhoteAdulto, animal);
				System.out.println(ad.tipoAnimalMoradia(moradia, animal, filhoteAdulto)); 
				
				 break;
				
			case 2: // laco doacao
				
				do {
					
				System.out.println("Antes de começarmos, poderia me informar seu nome?");
				String nomeD = input.next();
				
				Doacao d1 = new Doacao();//cria objeto d1
				
				//imprime pergunta forma contribuir
	            System.out.println("\nDe que forma voce gostaria de contribuir? \nDigite 1 - Brinquedos; 2 - Racao; 3 - Dinheiro: ");
	            d1.setTipoDoacao(input.nextInt()); //utiliza o Scanner e setter para inputar dado Inteiro
	            
	            int i = (Integer) d1.getTipoDoacao();
	            System.out.println(Doacao.tipo(i));
	            System.out.println("\nMuito Obrigade pela sua contribuicao, " + nomeD + "!");
	            System.out.println("Caso queira fazer uma nova doacao Digite 1; Para voltar ao menu inicial Digite 2.");
	            d = input.nextInt();
	            
	            	} while (d < 2 && d>=0);
	            
				break;
				
			case 3://laco lar temporario
				
				System.out.println("Qual seu nome?\n");
				String nomeT = input.next();
				System.out.println("Voce deseja adotar um gato ou cachorro? \n");
				String animalT = input.next();
				System.out.println("Digite o local seguro que voce provera \n ");
				String localT = input.next();
				Usuario usuarioVariavel = new Usuario(nomeT, animalT, localT);
				
				System.out.println("Seu nome e: " + usuarioVariavel.getNome());
				System.out.println("Voce deseja um " + usuarioVariavel.getTipoAnimal());
				System.out.println(" O seu local sera: " + usuarioVariavel.getLocalSeguro());
				
				break;
				
			case 4: // laco trabalhe conosco

				System.out.println("Vamos começar fazendo seu cadastro... ");
				System.out.println("Digite seu nome: ");
				String nomeC = input.next();
				System.out.println("Digite seu telefone para contato: ");
				String telefone = input.next();
				System.out.println("Tem preferência de trabalhar com um animal específico? ");
				System.out.println("Digite 1 se prefere gato ou 2 pra cachorro");
				int animalPref = input.nextInt();

				if (animalPref == 1) {

					System.out.println("Parabens " + nomeC + " Você escolheu trabalhar com gato");

				}

				else {

					System.out.println("Parabens " + nomeC + " Você escolheu trabalhar com cachorro");

				}

				System.out.println(nomeC + ", entraremos em contato através do numero de telefone: " + telefone);

				break;
				
			case 5:
				
				Denuncia2 c1 = new Denuncia2();

                c1.status();
                c1.dados();
               
                
               break;

			default:
				t =0;
			}
		
		} while (t != 0);
		input.close();
	}

}

