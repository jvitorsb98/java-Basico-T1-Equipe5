package MODEL;

public class Imovel {
	private int id;
    private String matricula;
    private String endereco;
    private int ultimaLeitura;
    private int penultimaLeitura;
    private static int quantidadeDeImoveis;
    Cliente cliente;

	    
    public Imovel() {
	}
    
	public Imovel(int id, String matricula, String endereco, int ultimaLeitura, int penultimaLeitura, Cliente cliente) {
		quantidadeDeImoveis++;
		this.id = quantidadeDeImoveis;
		this.id = id;
		this.matricula = matricula;
		this.endereco = endereco;
		this.ultimaLeitura = ultimaLeitura;
		this.penultimaLeitura = penultimaLeitura;
		this.cliente = cliente;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getUltimaLeitura() {
		return ultimaLeitura;
	}
	public void setUltimaLeitura(int ultimaLeitura) {
		this.ultimaLeitura = ultimaLeitura;
	}
	public int getPenultimaLeitura() {
		return penultimaLeitura;
	}
	public void setPenultimaLeitura(int penultimaLeitura) {
		this.penultimaLeitura = penultimaLeitura;
	}
    
}
