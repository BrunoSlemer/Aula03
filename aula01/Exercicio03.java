import java.util.Scanner;

/*Um professor adota a seguinte maneira de calcular a média. O aluno faz 3
provas, cada prova tem um peso
e a média é calculada por média ponderada. Faça um programa para ler os
pesos e depois calcular a média
ponderada de N alunos (N é informado pelo professor). Ao final, informe a
média da turma.*/

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double prova1, prova2, prova3, total = 0.00;
        Double peso1, peso2, peso3, pesototal;
        Double media1, media2, media3, Mtotal= 0.00, Mediafinal;
        //char N = 's';
        int N;
        int i = 1;

        System.out.println("Qual o Numero de alunos? ");
        N = entrada.nextInt();

        System.out.println("Qual o Peso da primeria prova? ");
        peso1 = entrada.nextDouble();

        System.out.println("Qual o Peso da segunda prova? ");
        peso2 = entrada.nextDouble();

        System.out.println("Qual o Peso da Terceira prova? ");
        peso3 = entrada.nextDouble();

        pesototal = peso1 + peso2 + peso3;

        for(; i <= N ; i++){

            System.out.println("para o aluno: " + i);
       
            System.out.println("Qual o Nota da primeria prova? ");
            prova1 = entrada.nextDouble();
    
            System.out.println("Qual o Nota da segunda prova? ");
            prova2 = entrada.nextDouble();
    
            System.out.println("Qual o Nota da Terceira prova? ");
            prova3 = entrada.nextDouble(); 

            media1 = (peso1 * prova1)/10.00;
            media2 = (peso2 * prova2)/10.00;
            media3 = (peso3 * prova3)/10.00;

        Mtotal = media1 + media2 + media3;
        total = Mtotal + total; 
        /*System.out.println("Deseja adicionar mais um aluno 's'im ou 'n'ão ? ");
        N = entrada.next().charAt(0);*/
        }
       
        Mediafinal = (total*10.00) / pesototal;

        System.out.println("total de notas " + total);

        System.out.println("Peso total " + pesototal);

        System.out.println("Numero de alunos: " + N );
        
        System.out.println( "media dos alunos: " + Mediafinal/N );
    }
}
