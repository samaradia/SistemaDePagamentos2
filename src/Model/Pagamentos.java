package Model;

public class Pagamentos {
    protected double valor;

    public Pagamentos() {
    }
    public Pagamentos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void confirmarPagamento(){
        valor += calcularTaxa();
    }

    public double calcularTaxa(){
        return valor * 0.0;
    }
}
