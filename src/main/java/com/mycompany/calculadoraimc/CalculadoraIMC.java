package com.mycompany.calculadoraimc;
import igu.Calculadora;

public class CalculadoraIMC {

    public static void main(String[] args) {
      Calculadora Calcular = new Calculadora();
      Calcular.setVisible(true);
      Calcular.setLocationRelativeTo(null);
    }
    public double calcularIMC(double pesoKg, double estaturaCm) {
        double estaturaM = estaturaCm / 100.0; 
        return pesoKg / (estaturaM * estaturaM);
    }
}
