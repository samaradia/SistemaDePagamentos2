package Model;

public class CartaoCredito extends Pagamentos {

    private double limiteDoCartao;

    public CartaoCredito() {
        super();
    }


    public boolean realizarCompra(double valorDaCompra){
        return valorDaCompra <= limiteDoCartao;

    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    @Override
    public void confirmarPagamento() {
        valor = calcularTaxa();
    }

    @Override
    public double calcularTaxa() {
        if(valor <= 500){
            return valor;
        } else {
            return valor + (valor * 0.03);
        }
    }

    public double valorFinal(){
        return valor;
    }

}
