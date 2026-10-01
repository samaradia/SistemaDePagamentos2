package Model;

public class BoletoBancario extends Pagamentos {

    private double diasDeAtraso;

    public BoletoBancario(double valor, double diasDeAtraso) {
        super(valor);
        this.diasDeAtraso =diasDeAtraso;
    }

    public double multaDeAtraso(int diasDeAtraso){
        if(diasDeAtraso <= 0 ){
            return 0;
        } else {
            return valor * 0.05;
        }
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",
        valor, calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.1;
    }
}
