package agregacao;

public class Vendedor {

    private String nome;
    private Double comissao;

    public Vendedor(String nome, Double comissao) {
        this.nome = nome;
        this.comissao = comissao;
    }

    public Vendedor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void vende(Produto produto, int quantidade) {
        System.out.println(nome + " está vendendo " + quantidade + " unidades do produto " + produto.getNome());
        // Lógica de venda aqui
    }

    public void vende() {
        System.out.println("vender");
        // Lógica de venda padrão aqui
    }
}
