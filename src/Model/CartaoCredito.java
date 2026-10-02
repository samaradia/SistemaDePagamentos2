package Model;

public class CartaoCredito extends Pagamentos {

    private double limiteDoCartao;

    public CartaoCredito(double valor, double limiteDoCartao) {
        super(valor);
        this.limiteDoCartao = limiteDoCartao;
    }

    public boolean realizarCompra(double valorDaCompra){
        return valorDaCompra <= limiteDoCartao;

    }

    @Override
    public void confirmarPagamento() {
        valor += calcularTaxa();
    }

    @Override
    public double calcularTaxa() {
        if(valor <= 500){
            return valor;
        } else {
            return valor + (valor * 0.03);
        }
    }




}
