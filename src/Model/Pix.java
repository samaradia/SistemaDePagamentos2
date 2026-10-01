package Model;

public class Pix extends Pagamentos {



    public Pix(double valor) {
        super(valor);
    }

    public double efetuarDesconto(){
        return valor- 0.2;
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Model.Pix de: " + valor + " confirmado.");
    }
}
