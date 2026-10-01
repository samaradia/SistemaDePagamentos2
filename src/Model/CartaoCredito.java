package Model;

public class CartaoCredito extends Pagamentos {

    private double limiteDoCartao;

    public CartaoCredito(double valor, double limiteDoCartao) {
        super(valor);
        this.limiteDoCartao = limiteDoCartao;
    }

    public void realizarCompra(double valorDaCompra){
        if(valorDaCompra <= limiteDoCartao){
            System.out.println("Autorizado, aguarde  confirmação de pagamento!");
        } else {
            System.out.println("Não foi autorizado sua compra!");
        }

    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n",
                valor, calcularTaxa());
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
