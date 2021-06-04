import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("bruno", "123-321","TI");
        Professor professor = new Professor("Giacomine", "321-123", 1000);

        //System.out.println(e.toString());
        //System.out.println(e.exibir());
        Pessoa pessoa;
        pessoa = professor;

        System.out.println(pessoa.exibir());// Polimorfismo
        System.out.println(estudante);

        //Casting - conversão 

       /* int i = 5;
        double d = 6.7;

        i = (int)d;
        System.out.println(i);*/

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add( new Estudante("E1", "T1","C1"));
        lista.add( new Professor("E1", "T1",1000));
        lista.add( new Estudante("E2", "T2","C2"));
        lista.add( new Professor("E4", "T4",4000));

        for (Pessoa pList : lista) {
            System.out.println(pList.exibir());
        }
    }
}
