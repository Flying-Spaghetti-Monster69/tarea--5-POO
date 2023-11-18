package figuras;

public class Piramide extends FiguraGeométrica {
private double base; /* Atributo que identifica la base de una
pirámide */
private double altura;
private double apotema; /* Atributo que identifica el apotema de
una pirámide */

public Piramide(double base, double altura, double apotema) {
this.base = base;
this.altura = altura;
this.apotema = apotema;
this.setVolumen(calcularVolumen()); 
this.setSuperficie(calcularSuperficie()); 
}
/**
* Método para calcular el volumen de una pirámide
* @return El volumen de una pirámide
*/
public double calcularVolumen() {
double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
return volumen;
}
/**
* Método para calcular la superficie de una pirámide
* @return La superficie de una pirámide
*/
public double calcularSuperficie() {
double áreaBase = Math.pow(base, 2.0);
double áreaLado = 2.0 * base * apotema;
return áreaBase + áreaLado;
}
}