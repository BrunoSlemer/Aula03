package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar ("São Paulo","Corinthians", 3, 0);
        Placar p2 = new Placar ("Santos", "Palmeiras");

        Placar p3 = new Placar ();
        
        System.out.println( p1.exibir());
        System.out.println( p2.exibir());
        System.out.println( p3.exibir());
        
    }
}
