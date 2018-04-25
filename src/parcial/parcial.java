package parcial;

import java.util.Scanner;

import pilas.Pila;

public class parcial {

	public static void main(String[] args) {
		int scc=0,op=0, Saldos=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese la cantidad de saldos de cuenas corrientes que desea cargar");
		scc = entrada.nextInt();
		Pila pSaldos = new Pila(scc);
		
		
		for (int i=0; i < scc; i++ ) {
			System.out.println("ingrese el saldo de la cuenta corriente");
			Saldos = entrada.nextInt();
			pSaldos.apilar(Saldos);
		}
		
		do {
			System.out.println("ingrese 1 para mostrar los datos crgado en la pila");
			System.out.println("ingrese 2 para mostrar el promedio de los saldos ");
			System.out.println("ingrese 3 para mostrar el saldo mas alto");
			System.out.println("ingrese 4 para mostrar la cantidad de saldos superiores a 1000");
			op = entrada.nextInt();
			switch (op) {
			case 1: 
				pSaldos.mostrar();
				break;
			case 2:
				pSaldos.promedio();
				break;
			case 3: 
				pSaldos.saldoM();
				break;
			case 4: 
				pSaldos.saldo();
				break;
			case 0:
				System.out.println("Gacias por usar el sistema");
				break;
			default:
				System.err.println("Opcion incorrecta");
			}

		} while (op != 0);
	
		
	}
}