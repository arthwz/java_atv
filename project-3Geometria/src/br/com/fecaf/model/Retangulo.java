package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    // Atributo
    public double lado1, lado2, area, perimetro;
    Scanner scanner = new Scanner(System.in);

    // Cadastro Retangulo
    public boolean cadatrarRetangulo () {
        System.out.println("Cadastrar Rentagulo");
        System.out.println("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Rentagulo Cadrasto com Sucesso !");
        return true;

    }
    // Calculo Area
    public void calcularArea() {
        System.out.println("Calcular Area");
        area = lado1 * lado2;
        System.out.println("A area é " + area);

    }
    // Calculo Perimetro
    public void calcularPerimetro () {
        System.out.println("Calcule Perimetro");
        perimetro = lado1 * 2 * lado2 * 2;
        System.out.println("O perimetro é: " + perimetro);

    }
}
