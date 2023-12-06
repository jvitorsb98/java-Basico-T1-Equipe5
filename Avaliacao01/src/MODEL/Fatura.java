package MODEL;

import java.time.LocalDate;

public class Fatura {
    private int id;
    private LocalDate data;
    private int ultimaLeitura;
    private int penultimaLeitura;
    private double valor;
    private boolean quitado;
    private Imovel imovel;
    private static int quantidadeDeFaturasCriadas;

    public Fatura(int ultimaLeitura, int penultimaLeitura, double valor, Imovel imovel) {
        quantidadeDeFaturasCriadas++;
        this.id = quantidadeDeFaturasCriadas;
        this.data = LocalDate.now();
        this.ultimaLeitura = ultimaLeitura;
        this.penultimaLeitura = penultimaLeitura;
        this.valor = valor;
        this.quitado = false;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
