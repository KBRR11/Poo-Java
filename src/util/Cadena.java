/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author anato
 */
public class Cadena {
    public static Scanner teclado = new Scanner(System.in);
	public static String leercadena() {
		String cadena;
		cadena = teclado.nextLine();
		return cadena.trim();			
	}
        public static int leerentero() {
		return Integer.valueOf(leercadena());
	}
        public static double leerdecimal() {
		return Double.valueOf(leercadena());
	}
	public static void saltolinea(int lineas) {
		for (int i = 0; i < lineas; i++) {
			System.out.print("\n");
		}
	}
}
