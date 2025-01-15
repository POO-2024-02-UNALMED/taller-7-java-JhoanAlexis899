package comunicacion;
public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}
	
	public void setFecha(String n) {
		fecha = n;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setPrimicia(String n) {
		primicia = n;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public void setInterpretacion(String n) {
		interpretacion = n;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	
	String interpretacion() {
		return this.interpretacion;
	}
	
	
	public String toString() {
		String s = this.resumen() + "\n";
		s += this.fecha + "\n" + this.primicia;
		return s;
	}
	
	int palabrasTotales( int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 10;
	}
}
