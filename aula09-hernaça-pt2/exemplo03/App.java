package exemplo03;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Marcos", 30);
        Pessoa p3 = new Pessoa("Marcos", 30, " Equina", 01);

        System.out.println(p.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());

        
    }
}