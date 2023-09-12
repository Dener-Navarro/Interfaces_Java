package Interfaces;

public interface ICaneta {
    public void escrever(String texto);
    public String getCor();

    default void escreverComumATodas(){ //método default que implementa a todos.
        System.out.println("Escrita igual a todas");
    }

}
