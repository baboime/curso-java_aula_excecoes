package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa_Pilha_Metodos {

	public static void main(String[] args) {
		
		metodo1();
		
		System.out.println("Fim do Programa");		
	}
	
	public static void metodo1() {
		System.out.println("***** INICIO METODO 1 *****");
		metodo2();
		System.out.println("***** FIM METODO 1 *****");
	}
	
	public static void metodo2() {
		System.out.println("***** INICIO METODO 2 *****");
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vetor = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao Inválida!");
			// imprime na tela o rastreamento do stack e continua execucao
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("Informação Inválida!");
		}
		sc.close();
		System.out.println("***** FIM METODO 2 *****");
	}
}
