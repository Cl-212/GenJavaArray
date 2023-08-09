package JavaTech;

import java.util.Scanner;

public class Ex01Matriz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int l, c, somaDp = 0, somaDs = 0;
		String elementosDp = "", elementosDs = "";

		for (l = 0; 1 < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ", l, c);
				matriz[l][c] = leia.nextInt();

				if (l == c) {
					elementosDp += matriz[l][c] + "";
					somaDp += matriz[l][c];

				}
				if (l + c == 2) {
					elementosDs += matriz[l][c] + "";
					somaDs += matriz[l][c];
				}
			}
			System.out.println("Elementos da Diagonal Principal:"+elementosDp);
		}
	}
}
