package Ejercicios;
import java.util.Scanner;
public class P4_Tres_en_Raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Apartado de los Jugadores
		
		String Jugador1;
		String Jugador2;
		
		// Apartado de los contadores de los jugadores 
		
		int contJ1 = 0;
		int contJ2 = 0;
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|         Bienvenido al Juego de Tres en Raya          |");
		System.out.println("|______________________________________________________|");
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 1           |");
		System.out.println("|______________________________________________________|");
		
		Jugador1 = teclado.next();
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 2           |");
		System.out.println("|______________________________________________________|");
		
		Jugador2 = teclado.next();
		
		
		
		
	}

}
