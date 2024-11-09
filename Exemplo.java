package lampada;
import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lampada lampada = new Lampada();
		System.out.println("Digite os dados da lâmpada:");
		System.out.printf("Marca: ");
		lampada.setMarca(scanner.nextLine());
		System.out.printf("Voltagem (em WATTS): ");
		lampada.setVoltagem(scanner.nextInt());
		scanner.nextLine(); // Para poder ler a variável seguinte sem problemas;
		System.out.printf("Tipo: ");
		lampada.setTipo(scanner.nextLine());
		System.out.printf("Modelo: ");
		lampada.setModelo(scanner.nextLine());
		System.out.printf("Cor: ");
		lampada.setCor(scanner.nextLine());
		System.out.printf("Preço (em reais): ");
		lampada.setPreco(scanner.nextDouble());
		System.out.printf("Garantia (em meses): ");
		lampada.setGarantia(scanner.nextInt());
		lampada.setLigada(false);
		System.out.println("Status: desligada");
		
		int pergunta;
		do {
			System.out.println("ligar/desligar lâmpada?");
			System.out.println("0 - Sair");
			System.out.println("1 - ligar");
			System.out.println("2 - desligar");
			pergunta = scanner.nextInt();
			
			if (pergunta==1 && !lampada.isLigada()) {
				System.out.println("#Lâmpada Ligada#\n");
				lampada.setLigada(true);
			}
			else if (pergunta==1 && lampada.isLigada()) {
				System.out.println("#A lâmpada já está ligada#\n");
			}
			else if (pergunta==2 && lampada.isLigada()) {
				System.out.println("#Lâmpada desligada#\n");
				lampada.setLigada(false);
			}
			else if (pergunta==2 && !lampada.isLigada()) {
				System.out.println("#A lâmpada já está desligada#\n");

			}
		}while (pergunta != 0);
		
		System.out.printf("#Programa encerrado#\n");
		
		scanner.close();
	}
}
