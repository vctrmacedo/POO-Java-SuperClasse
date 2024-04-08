import java.util.Scanner;

public class Navio extends Veiculo {
	private String nome;
	private int NumeroTripulantes;
	private String dataLancamento;

	// Métodos Construtores

	Navio() {
		super();
	}

	Navio(String nome, int CapacidadeTanque, int NumeroPassageiros, int NumeroTripulantes, double Preco,
			String dataLancamento) {
		super(CapacidadeTanque, NumeroPassageiros, Preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.NumeroTripulantes = NumeroTripulantes;
	}

	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroTripulantes() {
		return NumeroTripulantes;
	}

	public void setNumeroTripulantes(int NumeroTripulantes) {
		this.NumeroTripulantes = NumeroTripulantes;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	// Imprimir e Entrada
	@Override
	public void entrada(Scanner scanner) {
		try {
			System.out.println("Nome: ");
			this.nome = scanner.next();
			super.entrada(scanner);
			System.out.println("Número de Tripulantes: ");
			this.NumeroTripulantes = scanner.nextInt();
			System.out.println("Data de Lancamento: ");
			this.dataLancamento = scanner.next();

		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de inserir o tipo de dado correto.");
			scanner.nextLine();
		}
	}
	
	public void imprimir() {
		System.out.println("Prefixo: " + nome);
		System.out.println("Data de Lançamento: " + dataLancamento);
		System.out.println("Número de Tripulantes: " + NumeroTripulantes);
		super.imprimir(); //Tanque, passageiro e preço
	}

	public double passageirosPorTripulantes() {
		return (double) NumeroPassageiros / NumeroTripulantes;
	}

}
