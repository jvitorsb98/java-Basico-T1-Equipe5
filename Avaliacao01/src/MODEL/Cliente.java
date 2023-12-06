package MODEL;

import java.util.ArrayList;

public class Cliente {
	private int id;
    private String nome;
    private String cpf;
    ArrayList<Imovel> imoveisCliente;
    private static int quantidadeDeClientesCriados;
    
    
	public Cliente(String nome, String cpf) {
		quantidadeDeClientesCriados++;
		this.id = quantidadeDeClientesCriados;
		this.nome = nome;
		this.cpf = cpf;
		this.imoveisCliente = new ArrayList<>();
	}
	
	public Cliente() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Imovel> getImoveisCliente() {
		return imoveisCliente;
	}

	public void setImoveisCliente(ArrayList<Imovel> imoveisCliente) {
		this.imoveisCliente = imoveisCliente;
	}
    
	
	
	
}
