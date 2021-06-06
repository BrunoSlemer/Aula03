package exemplo02;

public class Gerente extends Funcionario{
    
    //Override = sobrepor um método de outra classe
    // do classe super

    public void caldularSalario(){}

    
    public String getNome() {
        
      return "Gerente" + super.getNome();
    }
}
