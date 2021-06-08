package exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }
    public Gerente(String nome){
        super(nome, 0);
    }
    @Override
    public String getDados() {
       
        return "Gerente: "+super.getNome()+"-"+super.getSalario() +" - " + numFuncionarios;
    }

    @Override
    public void aumenteSalario(double taxa) {
        
        super.aumenteSalario(taxa + 5);
    }
}
