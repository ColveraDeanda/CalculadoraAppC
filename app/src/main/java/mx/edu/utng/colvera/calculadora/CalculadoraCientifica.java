package mx.edu.utng.colvera.calculadora;

/**
 * Created by Ganzo on 25/09/2017.
 */

public class CalculadoraCientifica implements Calculadora {

    @Override
    public double sumar(double num1, double num2) {
        return 0;
    }

    @Override
    public double restar(double numero1, double numero2) {
        return 0;
    }

    public double factorial(double num1){ //Método recursivo
        if(num1==0){
            return 1;
        }else{
            return num1*factorial(num1-1);
        }
    }

}
