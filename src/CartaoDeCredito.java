public class CartaoDeCredito extends Pagamentos {

    private double limiteDoCartao;
    private double valorDaCompra;

    public CartaoDeCredito(String nome, double valor, double limiteDoCartao, double valorDaCompra) {
        super(nome, valor);
        this.limiteDoCartao = limiteDoCartao;
        this.valorDaCompra = valorDaCompra;
    }

    public void realizarCompra(){
        if(valorDaCompra <= limiteDoCartao){
           limiteDoCartao -= valorDaCompra;
            System.out.println("==========================================");
            System.out.println("\nAutorizado!");
            System.out.println("Cliente: " + getNome());
            System.out.println("Valor da Compra de R$: " + valorDaCompra);
            System.out.println("Limite restante: " + limiteDoCartao);
        } else {
            System.out.println("Saldo insufiente!");
        }
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédrito (Taxa: R%.2f)\n", valor, calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        if(valor <= 500){
            return valor;
        } else {
            return valor * 0.03;
        }
    }
}



