package exemplo01;

public class Motorista extends Funcionario{
    private String CNH;
    
    public Motorista(String nome, double salario, String CNH){
        super(nome, salario);
        this.CNH = CNH;        
    }
    @Override
    public String getDados() {
        
        return "Motorista: "+super.getNome()+"-"+super.getSalario()+" - CNH: "+ CNH;
    }
}
