package Model;

import java.util.ArrayList;

public class Entrada {
	ArrayList<Filtro> filtros;

	public Entrada() {
		filtros = new ArrayList<Filtro>();
	}

	public void recibir(Senal s) {

	}

	public void addFiltro(Filtro f) {
		filtros.add(f);
	}

}
