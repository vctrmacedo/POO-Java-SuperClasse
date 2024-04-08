import java.util.Scanner;

public class Veiculo {
	private int CapacidadeTanque;
	protected int NumeroPassageiros;
	protected double Preco;

	// Construtor Vazio
	public Veiculo() {

	}

	// Construtor
	public Veiculo(int CapacidadeTanque, int NumeroPassageiros, double Preco) {
		this.CapacidadeTanque = CapacidadeTanque;
		this.NumeroPassageiros = NumeroPassageiros;
		this.Preco = Preco;
	}

	// GETTERS e SETTERS

	public int getCapacidadeTanque() {
		return CapacidadeTanque;
	}

	public void setCapacidadeTanque(int CapacidadeTanque) {
		this.CapacidadeTanque = CapacidadeTanque;
	}

	public int getNumeroPassageiros() {
		return NumeroPassageiros;
	}

	public void setNumeroPassageiros(int NumeroPassageiros) {
		this.NumeroPassageiros = NumeroPassageiros;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(float Preco) {
		this.Preco = Preco;
	}

	// Métodos para entrada e impressão dos dados.

	public void imprimir() {
		System.out.println("Capacidade do tanque: " + CapacidadeTanque);
		System.out.println("Número de Passageiros: " + NumeroPassageiros);
		System.out.println("Preço: " + Preco);

	}

	public void entrada(Scanner scanner) {

		try {

			System.out.println("Digite a capacidade do tanque: ");
			this.CapacidadeTanque = scanner.nextInt();

			System.out.println("Digite o número de passageiros: ");
			this.NumeroPassageiros = scanner.nextInt();

			System.out.println("Digite o preço: ");
			this.Preco = scanner.nextDouble();

		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de inserir o tipo de dado correto.");
			scanner.nextLine();
		}

	}

}
