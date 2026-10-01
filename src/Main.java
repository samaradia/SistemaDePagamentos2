import Model.BoletoBancario;
import Model.CartaoCredito;
import Model.Pix;

public class Main {
    public static void main(String[] args){

        CartaoCredito cartaoCredito = new CartaoCredito(3000,5000);
        BoletoBancario boletoBancario = new BoletoBancario(256.69, 5);
         Pix pix = new Pix(269.90);

        cartaoCredito.realizarCompra(269.90);
        cartaoCredito.calcularTaxa();
        cartaoCredito.confirmarPagamento();

        boletoBancario.multaDeAtraso(0);
        boletoBancario.calcularTaxa();
        boletoBancario.confirmarPagamento();

        pix.efetuarDesconto();
        pix.confirmarPagamento();

    }
}