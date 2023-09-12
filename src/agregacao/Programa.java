package agregacao;

public class Programa {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(2200L, 1220.0, "TV");
        Produto produtoCel = criarProduto(12L, 1000.0, "Celular");

        Vendedor vendedor = criarVendedor("José", 10.0);
        Comprador comprador = criarComprador("Maria", 2000.0);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concetrizarVenda();
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(long codigo, double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(valor);
        return produto;
    }
}
