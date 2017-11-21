package Model;

import java.util.ArrayList;

public class Salida {
	
	ArrayList<Filtro> filtros;
	
	public Salida(){
		filtros = new ArrayList<Filtro>();
	}

	public void addFiltro(Filtro f) {
		filtros.add(f);
	}

}