package MODEL;

import java.util.Date;

public class Pagamento {
	private Date data;
    private double valor;
    private Fatura fatura;
	
    public Pagamento(Date data, double valor, Fatura fatura) {
		this.data = data;
		this.valor = valor;
		this.fatura = fatura;
	}

	public Pagamento() {
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
    
    
    
}
