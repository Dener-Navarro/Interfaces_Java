package Interfaces;

public interface ICarro {
    default void parar() {
        System.out.println("Carro está parando");
    }

    void andar();
}



