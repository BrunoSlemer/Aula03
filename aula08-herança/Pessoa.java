

public class Pessoa /*extends Object*/ {
    private String nome, telefone;
    
    //public Pessoa(){}

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public String exibir() {
        return "Nome : " + nome + ": " + telefone;
    }
    @Override
    public String toString(){
        return "Nome : " + nome + ": " + telefone;

    }
}