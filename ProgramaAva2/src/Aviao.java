import java.util.Scanner;

public class Aviao extends Veiculo {
	private String Prefixo;
	private String dataRevisao;

	// Métodos Construtores
	Aviao() {
		super();
	}

	Aviao(int CapacidadeTanque, int NumeroPassageiros, double Preco, String Prefixo, String dataRevisao) {
		super(CapacidadeTanque, NumeroPassageiros, Preco);
		this.Prefixo = Prefixo;
		this.dataRevisao = dataRevisao;
	}

	// Getters e Setters

	public String getPrefixo() {
		return Prefixo;
	}

	public void setPrefixo(String Prefixo) {
		this.Prefixo = Prefixo;
	}

	public String getDataRevisao() {
		return dataRevisao;
	}

	public void setDataRevisao(String dataRevisao) {
		this.dataRevisao = dataRevisao;
	}

	// Imprimir e entrada
	public void imprimir() {
		super.imprimir();
		System.out.println("Prefixo: " + Prefixo);
		System.out.println("Data de revisão: " + dataRevisao);
	}

	public void entrada(Scanner scanner) {
		try {
			System.out.println("Prefixo: ");
			this.Prefixo = scanner.next();
			super.entrada(scanner);
			System.out.println("Data de revisão: ");
			this.dataRevisao = scanner.next();

		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de inserir o tipo de dado correto.");
			scanner.nextLine();
		}
	}

	public void reajustarPreco(double percentual) {
		this.Preco *= (1 + percentual / 100);
	}

}
