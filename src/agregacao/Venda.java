package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;

    private Vendedor vendedor;

    private List<Produto> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto){
        this.produtos.add(produto);

    }

    public void concetrizarVenda(){
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("comprou os itens: ");
        for (Produto prod: this.produtos){
            System.out.println("nome do produto " + prod.getNome() + "valor produto " + prod.getPreco());
        }
        System.out.println("vendedor: " + this.vendedor.getNome());
    }
    public void cancelarVenda(){
        System.out.println("Venda cancelada");

    }
}
