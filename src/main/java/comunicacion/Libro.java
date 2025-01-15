package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public void setCo_autor(String s) {
		co_autor = s;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setEditorial(String s) {
		editorial = s;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEdicion(String s) {
		edicion = s;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setInterpretacion(String s) {
		interpretacion = s;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String s = this.resumen() + "\n";
		s += this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
		return s;
	}
	
	public int palabrasTotales( int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 2;
	}
	
}
