package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String or,String[] lista, String s) {
		super(or);
		letras = lista; interpretacion = s;
		
	}
	
	public void setLetras(String[] nuevasLetras) {
		letras = nuevasLetras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setInterpretacion(String nuevaInterpretacion) {
		interpretacion = nuevaInterpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String mensaje = "";
		for (int i=0; i<letras.length;i++) {
			mensaje += letras[i];
			
			if (letras[i] != letras[letras.length - 1]) {
				mensaje += ", ";
			}
		}
		return mensaje;
	}
	public int cantidadLetras() {
		return this.letras.length;
	}
}
