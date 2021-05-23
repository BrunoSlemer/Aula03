package exemplos;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void exibir() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
