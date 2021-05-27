package exemplos.exemplo03;

public interface Figura {
   default double perimetro(double... lados){
    double resultado = 0;
    for (double d : lados) {
        resultado += d;
    }
       return resultado;
   }
}
