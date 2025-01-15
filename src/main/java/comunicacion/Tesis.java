package comunicacion;
public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;

	}
	
	public void setIdea(String n) {
		idea = n;
	}
	
	public String getIdea() {
		return idea;
	}
	
	public void setArgumentos(String[] n) {
		argumentos = n;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public void setConclusion(String n) {
		conclusion = n;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setReferencias(String n) {
		referencias = n;
	}
	
	public String getReferencias() {
		return referencias;
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
		s += this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
		return s;
	}
	
	int palabrasTotales( int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 5;
	}
	

}
