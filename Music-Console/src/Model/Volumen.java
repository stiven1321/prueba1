package Model;

public class Volumen extends Filtro {

	@Override
	public Senal filtrar(Senal s, Object... arg) {
		Senal so = new Senal();
		///Siempre deberia usar volumen 
		///filtrar(s,volumen, valororiginal)
		if(arg.length == 2){
			String arg1 = (String) arg[1];
			String arg0 = (String) arg[0];
			so.x = (s.x * Double.parseDouble(arg1))/Double.parseDouble(arg0);
			return so;
		}else{
			return null;
		}
	}
	
}