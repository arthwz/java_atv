package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {
    //Atributo

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    //Cadastro Triangulo//
    public boolean cadastrarTriangulo() {
        System.out.println("/**********************/");
        System.out.println("/**Cadastro Triangulo**/");
        System.out.println("/**********************/");
        System.out.println("/* Informe o lado 1:     */");
        base = scanner.nextDouble();
        System.out.println("/* Informe o lado 2:    */");
        lado2 = scanner.nextDouble();
        System.out.println("/* Informe o lado 3:    */");
        lado3 = scanner.nextDouble();
        System.out.println("informe a altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triangulo Cadrastrado com Sucesso !");
        System.out.println("/************************************/");

        return true;
    }
    // Calculo Area
    public void calcularArea() {
        System.out.println("/***************************");
        System.out.println("/*     Calculando Area    */");
        System.out.println("/***************************");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/**************************/");
    }

    // Calculo Perimetro
    public void calcularPerimetro() {
        System.out.println("/****************************/");
        System.out.println("/*  Calculando o perimetro  */");
        System.out.println("/****************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("o perimetro é: " + perimetro);
        System.out.println("/*************************/");

    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/****************************/");
        System.out.println("/*      Definindo Tipo      */");
        System.out.println("/****************************/");

        if (base == lado2 && base == lado3 && lado2 == lado3) {

            System.out.println("Este Triangulo é Equilátero... ");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triangulo é Escaleno... ");
        } else {

            System.out.println("Este Triangulo é Isosceles... ");
        }
        System.out.println("/********************************/");
    }
        // Confere se o Triangulo é retangulo
        public void trianguloRetangulo() {
            System.out.println("/*********************************/");
            System.out.println("/*      Triangulo retangulo      */");
            System.out.println("/*********************************/");

            if (base * base == lado2 * lado2 + lado3 * lado3 && lado2 * lado2 == base * base + lado3 * lado3 && lado3 * lado3 == base * base + lado2 * lado2) {
                System.out.println("O triângulo é Retângulo.");
            } else {
                System.out.println("O triângulo não é Retângulo.");
            }

        }
    }



