package Model;

import java.util.ArrayList;

public class Consola {
	ArrayList<Entrada> entradas;
	ArrayList<Salida> salidas;
	
	public Consola(){
		entradas = new ArrayList<Entrada>();
		salidas = new ArrayList<Salida>();
	}

	public void recibir(Senal s, int i) {
		
	}

	public Senal salida() {
		return null;
	}

	public void inicializar() {
		Entrada uno = new Entrada();
		uno.addFiltro(new Volumen());
		Entrada dos = new Entrada();
		uno.addFiltro(new Volumen());
		Salida unica = new Salida();
		unica.addFiltro(new Volumen());
	}
}