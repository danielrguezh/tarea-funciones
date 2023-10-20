package ies.puerto;

/**
 * Realiza una función que realiza el cálculo del área en circulo.
 * @author Daniel
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion que calcula el ara del circulo
     * @param radio del circulo
     * @return area
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        resultado = (radio*radio)*Math.PI;

        return resultado;
    }
}