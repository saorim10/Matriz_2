package application;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
   uma matriz de M linhas por N colunas contendo números inteiros,
   podendo haver repetições. Em seguida, ler um número inteiro X que
   pertence à matriz. Para cada ocorrência de X, mostrar os valores à
   esquerda, acima, à direita e abaixo de X, quando houver.
 */

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas linha terá esta matriz? ");
		int lin = sc.nextInt();
		System.out.print("Quantas colunas terá esta matriz? ");
		int col = sc.nextInt();
		System.out.println("Digite os componentes da matriz: ");
		int[][] matriz = new int[lin][col];
		for(int i=0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.print("Digite um número para procurar na matriz: ");
		int num = sc.nextInt();
		int cont = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) {
					cont++;
					System.out.println(cont + "º numero " + num + " encontrado: está em " + i + ":" + j);
					if(j > 0) {
						// o número está depois da 1ª coluna
						System.out.println("< " + matriz[i][j-1]);
					}
					if(i > 0) {
						// o numero está depois da 1ª linha
						System.out.println("^ " + matriz[i-1][j]);
					}
					if(j < matriz[i].length-1) {
						// o numero está antes da última coluna 
						System.out.println("> " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) {
						// o numero está antes da última linha
						System.out.println("v " + matriz[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		sc.close();

	}

}
