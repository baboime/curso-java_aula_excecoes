package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa_Teoria_Excecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vetor = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao Inv�lida!");
		}
		catch (InputMismatchException e) {
			System.out.println("Informa��o Inv�lida!");
		}
		
		System.out.println("Fim do Programa");
		sc.close();
	}

}
