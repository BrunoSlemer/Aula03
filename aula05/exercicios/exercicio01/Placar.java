package exercicios.exercicio01;

public class Placar {
    String time1, time2;
    int gols1, gols2;

    public Placar(){
        this("time da casa", "time visitante", 0, 0);//chamada ao contrutor

    }
    public Placar(String time1, String time2){
        this(time1, time2, 0, 0);

    }
    public Placar(String time1 ,String time2, int gols1, int gols2){
        this.time1 = time1;
        this.gols1 = gols1;
        this.time2 = time2;
        this.gols2 = gols2;

    }
    public String exibir(){
        return(time1 + " " + gols1 + " X " + gols2 + " " + time2);
    }
}
