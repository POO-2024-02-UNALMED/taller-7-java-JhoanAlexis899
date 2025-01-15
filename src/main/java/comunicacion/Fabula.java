package comunicacion;
public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
		
	}
	
	public void setEnsenanza(String n) {
		ensenanza = n;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setInterpretacion(String n) {
		interpretacion = n;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String s = this.resumen() + "\n" + this.ensenanza;
		return s;
	}
	
	public int palabrasTotales( int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 1;
	}
	
}
