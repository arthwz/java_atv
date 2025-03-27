package br.com.fecaf.model;

import java.util.Scanner;

public class Quadrado {
    public double lado1, lado2, area, perimetro;
    Scanner scanner = new Scanner(System.in);

    public void cadatrarRetangulo () {
        System.out.println("Cadastrar Quadrado");
        System.out.println("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Quadrado Cadrasto com Sucesso !");

    }

    public void calcularArea() {
        System.out.println("Calcular Area");
        area = lado1 * lado1;
        System.out.println("A area é " + area);

    }

    public void calcularPerimetro () {
        System.out.println("Calcule Perimetro");
        perimetro = lado1  * lado1;
        System.out.println("O perimetro é: " + perimetro);

    }



}