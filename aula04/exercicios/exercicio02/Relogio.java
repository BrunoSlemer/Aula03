public class Relogio {

    int hora, minuto, segundo;

  void exibir(){
      //System.out.println( hora + ":" + segundo+ ":"  + segundo);
      //printf(FORMATO, VARIÁVEIS)
      // %d = inteiro, %f = decimal
      System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
  }   
    
}
