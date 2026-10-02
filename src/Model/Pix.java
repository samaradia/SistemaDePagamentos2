package Model;

public class Pix extends Pagamentos {



    public Pix(double valor) {
        super(valor);
    }


    @Override
    public double calcularTaxa() {
        return valor - (valor * 0.05);
    }

    @Override
    public void confirmarPagamento() {
       valor = calcularTaxa();
    }


}
