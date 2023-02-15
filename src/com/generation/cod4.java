package com.generation;

import java.util.Scanner; /*importamos paqueteria scanner*/

public class cod4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);/*agrego sistem .in*/

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		Scanner s2 = new Scanner(System.in); /*agrego sistem .in*/
		String j2 = s2.nextLine();

		if (j1.equals(j2)) {/*para comparar cadenas de caracteres utilizamos .equals()*/
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {/*para comparar cadenas de caracteres utilizamos .equals()*/
					g = 1;
				}
				break;
			case "papel":
				if (j2.equals("piedra")) {/*para comparar cadenas de caracteres utilizamos .equals()*/
					g = 1;
				}
				break;
			case "tijeras":
				if (j2.equals("papel")) {/*para comparar cadenas de caracteres utilizamos .equals()*/
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
	}
}
