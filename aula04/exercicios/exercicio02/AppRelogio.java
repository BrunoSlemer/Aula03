public class AppRelogio {
    
    public static void main(String[] args) {
        
        Relogio time = new Relogio();

        time.hora = 10;
        time.minuto = 3;
        time.segundo = 5;
        
        time.exibir();
    }
}
