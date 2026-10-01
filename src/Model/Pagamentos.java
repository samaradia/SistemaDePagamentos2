package Model;

public class Pagamentos {
    protected double valor;

    public Pagamentos(double valor) {
        this.valor = valor;
    }

    public void confirmarPagamento(){
        System.out.printf("Pagamento de R$%.2f confirmado\n",
                valor, calcularTaxa());
    }

    public double calcularTaxa(){
        return valor * 0.0;
    }
}
