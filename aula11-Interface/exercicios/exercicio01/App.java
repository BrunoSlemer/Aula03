package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Circulo c = new Circulo(5);

        System.out.println(q.getNomeFigura());
        System.out.println("Area do quadrado: " + q.getArea());
        System.out.println("Perimetro do quadrado: " + q.getPerimetro());
        System.out.println(c.getNomeFigura());
        System.out.println("Area do circulo: " + c.getArea());
        System.out.println("Perimetro do circulo: "+ c.getPerimetro());
    }
}
