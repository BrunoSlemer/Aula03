package exemplo01;

import java.util.Scanner;


public class AppFuncionario {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu, numFuncionarios, horas;
        String nome, carta;
        double salario;
        GerenciaFuncionario funcionarios = new GerenciaFuncionario();

        do {
            

        System.out.println("1-Novo Motorista");
        System.out.println("2-Novo Gerente");
        System.out.println("3-Novo Estoquista");
        System.out.println("4-Listar");
        System.out.println("5-Buscar por nome");
        System.out.println("6-Sair");
        menu = Integer.parseInt(in.nextLine());

        switch (menu) {
            case 1:
            System.out.println("Informe o nome: ");
            nome = in.nextLine();
            System.out.println("Informe o salario");
            salario = Double.parseDouble(in.nextLine());
            System.out.println("Informe o tipo da CNH");
            carta = in.nextLine();
            funcionarios.novoMotorista(nome, salario, carta);
                    
                break;
            
            case 2:
            System.out.println("Informe o nome: ");
            nome = in.nextLine();
            System.out.println("Informe o salario");
            salario = Double.parseDouble(in.nextLine());
            System.out.println("Informe o Numero de Funcionarios");
            numFuncionarios = Integer.parseInt(in.nextLine());
            funcionarios.novoGerente(nome, salario, numFuncionarios);
                break;
            
            case 3:
            System.out.println("Informe o nome: ");
            nome = in.nextLine();
            System.out.println("Informe o salario por hora");
            salario = Double.parseDouble(in.nextLine());
            System.out.println("Informe o Numero de horas trabalhadas");
            horas = Integer.parseInt(in.nextLine());
            funcionarios.novoEstoquista(nome, salario, horas);
                break;
            

            case 4:
                    System.out.println(funcionarios.listar());
                break;
            

            case 5:
                System.out.println("Informe o nome: ");
                nome = in.nextLine();
                System.out.println(funcionarios.buscarNome(nome));
                    
                break;
            

            case 6:
                    
                break;
            
            default:
                System.out.println("opção Invalida");
                
            }

            } while (menu != 6);
    }
}
