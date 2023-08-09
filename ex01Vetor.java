package JavaTech;//Clesio Olimpio Santos

import java.util.Scanner;

public class ex01Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int posi = -1;
		int vetor[] = { 2, 5, 4, 8, 10, 3, 7, 6, 1, 9 };
		
		System.out.println("Qual número deseja encontrar(1 a 10)?\n");
		Scanner leia = new Scanner(System.in);

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		num = in.nextInt();

		for (int i = 0; i < 10; i++) {
			if (vetor[i] == num) {
				posi = i;
				break;
			}
		}

		if (posi < 0) {
			System.out.println("Nao foi encontrado!!");
		} else {
			System.out.printf("O numero %d esta localizado na posicao: %d", num, posi);

		}
	}
}
