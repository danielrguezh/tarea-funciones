package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en cuadrado y un rectángulo.
 * @author Daniel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion para calcular el area de un cuadrado
     * @param a lado del cuadrado
     * @return area
     */
    public int areaCuadrado(int a) {
        int resultado = 0;

        resultado = a*a;

        return resultado;
    }

    /**
     * Funcion para calcular el area de un rectangulo
     * @param a lado del rectangulo
     * @param b lado del rectangulo
     * @return area
     */
    public int areaRectangulo(int a, int b) {
        int resultado = 0;

        resultado = a*b;

        return resultado;
    }
}