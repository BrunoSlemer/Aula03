public class AppPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa(); // instaciar um objeto Pessoa
        Pessoa p2 = new Pessoa(); 
        String telefone;//variavel local

        p.nome = "Bruno";
        p.telefone = "1234567";
        p.apresentar();
        telefone = p.obterTelefone();
        System.out.println(telefone);

        p2.nome = "Roberta";
        p2.telefone = "987654";
        p2.apresentar();
        System.out.println(p2.obterTelefone());

        

    }
}
