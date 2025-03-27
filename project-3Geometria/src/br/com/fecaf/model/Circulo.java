package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Atributo

    public double raio, area, perimetro;
    Scanner scanner = new Scanner(System.in);

    // Cadastro Circulo
    public boolean cadastrarCirculo(){
        System.out.println("/********************/");
        System.out.println("/**Cadastro circulo**/");
        System.out.println("/********************/");
        System.out.println("informe o raio do circulo: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo cadastrado com sucesso !");
        return true;

    }
    // Calculo Area
    public void calcularArea (){
        System.out.println("/*calculando area*/");
        area = 3.14159 * (raio * raio);

    }
    // Calculo Perimetro
    public void calcularPerimetro () {
        System.out.println("Calculando o perimetro");
        perimetro = 2 * Math.PI * raio;

    }
}

