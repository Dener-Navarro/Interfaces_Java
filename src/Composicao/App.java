
package Composicao;

public class App {

    public static void main(String args[]) {
        Banco banco = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Joana Banc");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(20d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);
    }
}
