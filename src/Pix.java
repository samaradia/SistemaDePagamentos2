public class Pix extends Pagamentos {

    public Pix(String nome, double valor) {
        super(nome, valor);
    }

    public void efetuarDesconto(){
        valor = valor - (valor * 0.05);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de: " + valor + " confirmado.");
    }
}
