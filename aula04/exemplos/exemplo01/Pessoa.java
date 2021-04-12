
public class Pessoa {
    //atributos
    String nome;
    String telefone;

    // métodos
    void apresentar(){
        System.out.println("Olá! eu sou " + nome);
       // System.out.println("meu numero é " + telefone);
    }
    String obterTelefone(){
        return telefone;
    }
}
