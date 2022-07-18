package br.com.gen.projeto;

public class Doacao {

	private int tipoDoacao;

	// getters and setters

	public int getTipoDoacao() {
		return tipoDoacao;
	}

	public void setTipoDoacao(int tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}

	// funcao - metodo
	public static String tipo (int tipoDoacao) {
		String resposta;
		
		switch (tipoDoacao) {
		case 1:
			resposta = "\nToda forma de contribuir e valida, temos certeza que seu brinquedo fara a vida de um Pet mais feliz."
					+ "\nPara entregar o brinquedo visite nossa sede no endereço X, das 8h00 as 17h00."
					;
			break;
		case 2: 
			resposta = "\nTodos precisam se alimentar e temos certeza que os Pets ficarao muito felizes com esta refeicao!"
					+ "\nPara entregar a racao visite nossa sede no endereço X, das 8h00 as 17h00.";
			break;
			
		case 3: 
			resposta = "\nSua contribuicao e muito importante para a manutencao do nosso trabalho!"
					+ "\nPara doar voce pode fazer uma transferencia para a nossa conta bancaria ou pix no QR Code ao fim da pagina:"
					+ "\n" + "\nTitular: Lar Para Todos \nDados Bancarios: \nC.C. 0000001 \nAgencia 00001 ";
			break;
			default:
				resposta = "Opção inválida. Por gentileza, tente novamente.";
		}
		return resposta;

	}
}
