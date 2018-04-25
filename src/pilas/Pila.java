package pilas;

public class Pila {

	// ATRIBUTOS
	private int capacidad;
	private int indice;
	private int[] datos;

	// CONSTRUCTORES

	// Constructor que toma como parámetro el tamaño del array.
	public Pila(int cap) {
		capacidad = cap;
		indice = 0;
		datos = new int[capacidad];
	}

	// MÉTODOS
	// apilar(): apila un elemento en la pila.
	// Si está llena, muestra mensaje de error
	public void apilar(int elem) {
		if (!estaLlena()) {
			datos[indice++] = elem;
		} else {
			System.out.println("La pila esta llena");
		}
	}

	// Desapilar(): desapila el elemento de la cima de la pila.
	// Si está vacía, muestra mensaje de error
	public int desapilar() {
		if (!estaVacia()) {
			return datos[--indice];
		} else {
			System.out.println("La pila esta vacia");
			return 0;
		}
	}

	// verCima(): consulta sin desapilar la cima de la pila.
	public int verCima() {
		if (!estaVacia()) {
			return datos[indice - 1];
		} else {
			System.out.println("La pila esta vacia");
			return 0;
		}
	}

	// vaciar(): vacía la pila.
	public void vaciar() {
		indice = 0;
	}

	// estaLlena(): devuelve true si la pila está llena.
	public boolean estaLlena() {
		return (indice == capacidad);
	}

	// estaVacia(): devuelve true si la pila está vacía.
	public boolean estaVacia() {
		return (indice == 0);
	}

	// mostrar(): recorre la pila desde la base mostrando su contenido.
	public void mostrar() {
		if (!estaVacia()) {
			for (int i = 0; i < indice; i++) {
				System.out.println("Elemento en posicion " + i + ": " + datos[i]);
			}
		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void sumar() {
		int sum = 0;
		if (!estaVacia()) {
			for (int i = 0; i < indice; i++) {
				sum = sum + datos[i];
			}
			System.out.println("la suma es: " + sum);

		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void promedio() {
		float prom = 0;
		int sum = 0;
		if (!estaVacia()) {
			for (int i = 0; i < indice; i++) {
				sum = sum + datos[i];
			}
			prom = sum / indice;
			System.out.println("el promedio es: " + prom);

		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void porcentaje() {
		float ap = 0, dp = 0;
		for (int i = 0; i < indice; i++) {
			if (datos[i] > 3) {
				ap++;
			} else {
				dp++;
			}

		}
		ap = (ap * 100) / indice;
		dp = (dp * 100) / indice;
		System.out.println("el porcentaje de aprovados es: % " + ap);
		System.out.println("el porcentaje de desaprovados es: % " + dp);
	}

	public void ventas() {
		int v = 0, acumv = 0, acum = 0;
		for (int i = 0; i < indice; i++) {
			if (datos[i] > 200) {
				acumv++;
			}
			if (datos[i] <= 200) {
				acum++;
			}
		}
	}

	public void ventaM() {
		if (!estaVacia()) {
			int ventaM = datos[0];
			for (int i = 0; i < indice; i++) {
				if (ventaM < datos[i])
					ventaM = datos[i];
			}
			System.out.println("la venta maxima es:  " + ventaM);

		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void ventaMn() {
		if (!estaVacia()) {
			int ventaMn = datos[0];
			for (int i = 0; i < indice; i++) {
				if (ventaMn > datos[i])
					ventaMn = datos[i];
			}
			System.out.println("la venta minima es:  " + ventaMn);

		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void saldoM() {
		if (!estaVacia()) {
			int saldoM = datos[0];
			for (int i = 0; i < indice; i++) {
				if (saldoM < datos[i])
					saldoM = datos[i];
			}
			System.out.println("el saldo mas alto es:  " + saldoM);

		} else {
			System.out.println("La pila esta vacia");
		}
	}

	public void saldo() {
		int s = 0, acums = 0, acum = 0;
		for (int i = 0; i < indice; i++) {
			if (datos[i] > 1000) {
				acums++;
			}

		}
		System.out.println("los saldos mayores a 1000 son:  "+ acums);
	}
}
