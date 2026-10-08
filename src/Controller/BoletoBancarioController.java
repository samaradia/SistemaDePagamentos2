package Controller;

import Model.BoletoBancario;
import View.BoletoBancarioView;

import java.util.Scanner;

public class BoletoBancarioController {
    private Scanner leitura;

    public BoletoBancarioController(Scanner leitura) {
        this.leitura = leitura;
    }

    BoletoBancario boletoBancario = new BoletoBancario();
    BoletoBancarioView boletoBancarioView = new BoletoBancarioView();

    public void fluxoDoBoleto() {
        boletoBancarioView.mostrarMensagens("Digite os dias de atraso: ");
        int diasDeAtraso = leitura.nextInt();
        boletoBancario.setDiasDeAtraso(diasDeAtraso);

        boletoBancarioView.mostrarMensagens("Digite o valor a ser pago: ");
        double valorPago = leitura.nextDouble();
        boletoBancario.setValor(valorPago);

        boolean podeComprarBoleto = boletoBancario.setDiasDeAtraso(diasDeAtraso);

        if (diasDeAtraso > 0) {
            boletoBancario.calcularTaxa();
            {
                boletoBancario.confirmarPagamento();
                double valorFinal = boletoBancario.valorFinal();
                boletoBancarioView.mostrarMensagens("\nO valor final com a taxa 5%: " + valorFinal);

            }
        }
    }
}
