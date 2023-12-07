package MODEL;

import java.util.Date;

public class Fatura {
	private int id;
    private Date data;
    private int ultimaLeitura;
    private int penultimaLeitura;
    private double valor;
    private boolean quitado;
    private Imovel imovel;
	
    public Fatura(int id, Date data, int ultimaLeitura, int penultimaLeitura, double valor, boolean quitado,
			Imovel imovel) {
		this.id = id;
		this.data = data;
		this.ultimaLeitura = ultimaLeitura;
		this.penultimaLeitura = penultimaLeitura;
		this.valor = valor;
		this.quitado = quitado;
		this.imovel = imovel;
	}

	public Fatura() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isQuitado() {
		return quitado;
	}

	public void setQuitado(boolean quitado) {
		this.quitado = quitado;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
    
    
}
