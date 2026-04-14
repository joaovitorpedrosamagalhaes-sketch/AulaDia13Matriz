/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvmatriz;

import java.util.Scanner;

/**
 *
 * @author 326125802
 */
public class AtvMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas (n): ");
        int n = sc.nextInt();
        System.out.print("Digite o número de colunas (m): ");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz transposta:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}