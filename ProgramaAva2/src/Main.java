import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Aviao[] avioes = new Aviao[10];
		Navio[] navios = new Navio[10];

		// Criando objetos Avião

		for (int i = 0; i < 10; i++) {
			avioes[i] = new Aviao();
			System.out.println("Entre com os dados do avião " + (i + 1) + ":");
			avioes[i].entrada(scanner);
		}

		// Criando objetos Navio
		for (int i = 0; i < 10; i++) {
			navios[i] = new Navio();
			System.out.println("Entre com os dados do navio " + (i + 1) + ":");
			navios[i].entrada(scanner);
		}
		
		// Exibindo os dados dos aviões
        System.out.println("Dados dos aviões:");
        for (Aviao aviao : avioes) {
            aviao.imprimir();
            System.out.println();
        }
        
     // Exibindo os dados dos navios
        System.out.println("Dados dos navios:");
        for (Navio navio : navios) {
            navio.imprimir();
            System.out.println();
        }

        scanner.close();

	}

}
