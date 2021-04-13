package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar ("São Paulo","Corinthians", 3, 0);
        Placar p2 = new Placar ("Santos", "Palmeiras");

        Placar p3 = new Placar ();
        
        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
