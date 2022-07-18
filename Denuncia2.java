package br.com.gen.projeto;



import java.util.Random;
import java.util.Scanner;

public class Denuncia2 {

		 void dados (){
			
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("para cntinuar com sua denuncia digite seu nome");
		String nome = entrada.nextLine();

		System.out.println("digite endereço da denuncia");
		String endereco = entrada.nextLine();

		System.out.println("resuma os fatos");
		String fatos = entrada.nextLine();

		System.out.println("se estiver tudo certo com sua denuncia digite 1 ");
		int aux = entrada.nextInt();
		
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(50000);

		if (aux == 1) {

			System.out.println("seu protocolo é " + valor);

		}
			
	}

	void status() {
		System.out.println("Maus-tratos aos animais é crime:");
		System.out.println("ligue 181 ou 0800-600-6428 ou utilize o site da Depa  ");
		System.out.println(" Delegacia Eletrônica de Proteção Animal");

	}

	

	
	

}



