package exemplo01;

public abstract class Funcionario {
    private String nome;
    private double salario;

    //public Funcionario(){}

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract String getDados();// abstract torna o metodo obrigátorio em todas as classes extends
    //{
    //    return nome + " - " + salario;
    //}

    public String getNome(){
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    
    public void aumenteSalario(double taxa ){
        salario = salario + salario * taxa/100;
    }
}