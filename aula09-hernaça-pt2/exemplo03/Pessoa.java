package exemplo03;

public class Pessoa {
    private String nome; // null =! void
    private int idade;
    private Endereço endereco;

    public Pessoa(){
        nome = "Sem nome";

        endereco = new Endereço();
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        endereco = new Endereço("Sem Endereço", 0);
    }
    public Pessoa(String nome, int idade, String nomeRua, int numero){
        this.nome = nome;
        this.idade = idade;
        endereco = new Endereço(nomeRua, numero);
    }


    
    public String exibir(){
        return nome + "(" + idade+ ")"+ ": " + endereco.exibir(); 
    }
}
