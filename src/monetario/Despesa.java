package monetario;

public class Despesa {
 
	private double valor;
	private String data;
	private String justificativa;
	private String tipo;

	
	public Despesa(double valor, String data, String justificativa, String tipo) {
		
		this.valor = valor;
		this.data = data;
		this.justificativa = justificativa;
		this.tipo = tipo;
		
	}
	
	// set & get valor
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return this.valor;
	}
	
	
	// set & get data
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}
	
	
	// set & get justificativa
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getJustificativa() {
		return this.justificativa;
	}
	
	
	// set & get tipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
}
