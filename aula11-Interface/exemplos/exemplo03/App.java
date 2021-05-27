package exemplos.exemplo03;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Quadrado(12));
        figuras.add(new Quadrado(11.5));
        figuras.add(new Triangulo(12, 13, 14));
        figuras.add(new Triangulo(2, 3, 4));

     /*   for(Figura figura : figuras){
            System.out.println("Perimentro: " + figura.perimetro());
        } */

        System.out.println(((Quadrado)figuras.get(0)).perimetro());
        System.out.println(figuras.get(0).perimetro(12));
        System.out.println(figuras.get(0).perimetro(1, 2, 3, 4));
    }
}
