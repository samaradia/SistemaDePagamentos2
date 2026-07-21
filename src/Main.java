import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite o valor de sua compra: ");
        double valor = leitura.nextDouble();
        System.out.println("=====================================");

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("1- Cartão de Créito.");
        System.out.println("2- Boleto.");
        System.out.println("3- Pix");

        int opcao = leitura.nextInt();

        if(opcao == 1){
            System.out.println("Digite seu limite o cartão: ");
            double limite = leitura.nextDouble();
            CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(nome,valor,limite,valor);
            cartaoDeCredito.realizarCompra();
            cartaoDeCredito.confirmarPagamento();

        } else if (opcao == 2) {
            System.out.println("Digite os dias de atraso: ");
            int dias = leitura.nextInt();
            BoletoBancario boletoBancario = new BoletoBancario(nome, valor, dias);
            boletoBancario.confirmarPagamento();
        } else if(opcao == 3){
            System.out.println("Digite o valor do pix: ");
            double viaPix = leitura.nextDouble();
            Pix pix = new Pix(nome, viaPix);
            pix.efetuarDesconto();
            pix.confirmarPagamento();
        }
        leitura.close();
    }
}