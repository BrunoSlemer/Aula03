package exemplo03;

public class Endereço {
    private String nome;
    private int numero;

    public Endereço(){
        nome = "Sem endereco cadastrado";
    }
    
    public Endereço(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    

    public String exibir(){
        return nome + ", " + numero;
    }
}
