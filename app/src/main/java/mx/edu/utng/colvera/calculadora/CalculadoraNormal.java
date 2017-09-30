package mx.edu.utng.colvera.calculadora;

/**
 * Created by Ganzo on 25/09/2017.
 */

public class CalculadoraNormal implements Calculadora{


    @Override
    public double sumar(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1-num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1*num2;
    }

    public double division(double num1, double num2) {
        return num1/num2;
    }
}

