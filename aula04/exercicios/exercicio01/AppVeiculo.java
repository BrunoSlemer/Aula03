

public class AppVeiculo {

    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        Veiculo v2 = new Veiculo();

        v.marca = "FIAT";
        v.modelo = "UNO";
        v.consumo = 16.2;
        v.dadosdocarro();
        System.out.println("Realiza " + v.ObterConsumo() + "km/l");
        
        v2.marca = "Ford";
        v2.modelo = "Ka";
        v2.consumo = 12.5;
        v2.dadosdocarro();
        System.out.println("Realiza " + v2.ObterConsumo() + "km/l");


    }
}
