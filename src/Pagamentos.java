public class Pagamentos {
    private String nome;
    protected double valor;

    public Pagamentos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularTaxa(){
        return valor * 0.0;
    }

    public void confirmarPagamento(){
        System.out.printf("Pagamento de R$.2f confirmado\n", valor, calcularTaxa());
    }
}
