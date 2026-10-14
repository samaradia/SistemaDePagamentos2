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


        if (diasDeAtraso > 0) {
            boletoBancario.calcularTaxa();
            boletoBancario.confirmarPagamento();
            boletoBancarioView.exibirComTaxa(boletoBancario);
            boletoBancarioView.exibirConfirmacao();
        }else {
            boletoBancario.confirmarPagamento();
            boletoBancarioView.mostrarMensagens("Parabéns você não teve nenhum atraso!");
            boletoBancarioView.exibirComTaxa(boletoBancario);
            boletoBancarioView.exibirConfirmacao();

        }
    }
}
