package exemplo01;
public class Estoquista extends Funcionario{
    private int horas;
    private double salarioT;

    public Estoquista(String nome,double salario, int horas){
        super(nome, salario);
        this.horas = horas;
        this.salarioT = super.getSalario() * horas;
    }
    @Override
    public String getDados() {
        
        return "Estoquista: "+getNome()+"-"+getSalario()+" - horas trabalhadas:"+ 
        horas +"\n salario total: "+ salarioT;
    }
}
