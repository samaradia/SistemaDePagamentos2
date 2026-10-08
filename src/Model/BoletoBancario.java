package Model;

public class BoletoBancario extends Pagamentos {

    private int diasDeAtraso;

    public BoletoBancario(double valor, int diasDeAtraso) {
        super(valor);
        this.diasDeAtraso = diasDeAtraso;
    }

    public BoletoBancario() {

    }

    public int getDiasDeAtraso() {
        return diasDeAtraso;
    }

    public boolean setDiasDeAtraso(int diasDeAtraso) {
        this.diasDeAtraso = diasDeAtraso;
        return false;
    }

    @Override
    public double calcularTaxa() {
        if(diasDeAtraso <= 0 ){
            return 0;
        } else {
            return valor * 0.05;
        }
    }

    @Override
    public void confirmarPagamento() {
        valor += calcularTaxa();
    }

    public double valorFinal() {
        return valor;
    }
}


