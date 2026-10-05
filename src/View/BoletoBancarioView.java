package View;

import Model.BoletoBancario;

public class BoletoBancarioView {

    public void exibirComTaxa(BoletoBancario boletoBancario ){
        System.out.println("Seu boleto atrasou: " + boletoBancario.getDiasDeAtraso()
                + "\nO valor do boleto final ficou de: " + boletoBancario.valorFinal());
    }

    public void mostrarMensagens(String mensagens){
        System.out.println("\n" + mensagens);
    }

    public void exibirConfirmacao(){
        System.out.println("\nBoleto gerado com sucesso!");
    }

}
