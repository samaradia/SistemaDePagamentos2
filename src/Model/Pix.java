package Model;

public class Pix extends Pagamentos {

    private double valorOriginal;

    public Pix(double valor) {
        super(valor);
        this.valorOriginal = valor;
    }


    @Override
    public double calcularTaxa() {
        return valorOriginal - (valorOriginal * 0.05);
    }

    @Override
    public void confirmarPagamento() {
       valor = calcularTaxa();
    }


}
