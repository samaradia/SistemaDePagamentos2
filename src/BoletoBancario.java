public class BoletoBancario extends Pagamentos{

    private int diasDeAtraso;

    public BoletoBancario(String nome, double valor, int diasDeAtraso) {
        super(nome, valor);
        this.diasDeAtraso = diasDeAtraso;
    }

    public double multaDeAtraso(){
        if(diasDeAtraso <= 10){
            return 0;
        } else {
            return valor * 0.05;
        }

    }

    @Override
    public double calcularTaxa() {
        return valor * 0.1;
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento realizado!");
        System.out.println("Cliente: " + getNome());
        System.out.println("Valor da compra: "+ valor);
    }
}
