package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    // Instancia Scanner
    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("/********************/");
            System.out.println("/*   Geometria      */");
            System.out.println("/********************/");
            System.out.println("/* 1 - Círculo      */");
            System.out.println("/* 2 - Retângulo    */");
            System.out.println("/* 3 - Triângulo    */");
            System.out.println("/* 4 - Sair         */");
            System.out.println("/********************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:
                    Circulo circulo = new Circulo();
                    boolean exitCirculo = false;
                    boolean validaCirculo = false;
                    while (!exitCirculo) {
                        // Menu Circulo
                        System.out.println("/**************************/");
                        System.out.println("/****      Círculo     ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Círculo */");
                        System.out.println("/* 2 - Calcular Área     */");
                        System.out.println("/* 3 - Calcular Perímetro */");
                        System.out.println("/* 4 - Sair              */");
                        System.out.println("/**************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                // Validação do cadastro do circulo
                                validaCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                // Calculo da area do circulo cadastrado
                                if (validaCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Círculo");
                                }
                                break;
                            case 3:
                                // Calculo do perimetro do circulo cadastrado
                                if (validaCirculo) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Círculo");
                                }
                                break;
                            case 4:
                                // Sai da opção "Circulo"
                                System.out.println("Saindo do Círculo...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;

                case 2:
                    Retangulo retangulo = new Retangulo();
                    boolean exitRetangulo = false;
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {
                        // Menu Retangulo
                        System.out.println("/****************************/");
                        System.out.println("/****      Retângulo     ****/");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Retângulo */");
                        System.out.println("/* 2 - Calcular Área      */");
                        System.out.println("/* 3 - Calcular Perímetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/****************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                // Validação do cadrastro do Retangulo
                                validaRetangulo = retangulo.cadatrarRetangulo();
                                break;
                            case 2:
                                //  Calculo da area do Retangulo cadastrado
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo!");
                                }
                                break;
                            case 3:
                                // Calvulo do perimetro do Retangulo cadastrado
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo!");
                                }
                                break;
                            case 4:
                                // Saindo da opção "Retangulo"
                                System.out.println("Saindo do Retângulo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;

                case 3:
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;
                    boolean exitTriangulo = false;

                    while (!exitTriangulo) {
                        // Menu Triangulo
                        System.out.println("/****************************/");
                        System.out.println("/****      Triângulo     ****/");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo */");
                        System.out.println("/* 2 - Calcular Área       */");
                        System.out.println("/* 3 - Calcular Perímetro  */");
                        System.out.println("/* 4 - Definir Tipo        */");
                        System.out.println("/* 5 - Verificar Retângulo */");
                        System.out.println("/* 6 - Sair                */");
                        System.out.println("/****************************/");
                        System.out.print("Informe a opção desejada: ");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                // Validação do cadrastro do Triangulo
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                // Calculo da area do triangulo cadastrado
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo!");
                                }
                                break;
                            case 3:
                                // Calculo do perimetro do triangulo cadastrado
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo!");
                                }
                                break;
                            case 4:
                                // Define o tipo do Triangulo
                                if (validaTriangulo) {
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um Triângulo!");
                                }
                                break;
                            case 5:
                                // Verifica se ele é um Triangulo retangulo
                                if (validaTriangulo) {
                                    triangulo.trianguloRetangulo();
                                } else {
                                    System.out.println("Cadastre um Triângulo!");
                                }
                                break;
                            case 6:
                                System.out.println("Saindo do Triângulo...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida!");
                        }
                    }
                    break;
                // Saí do menu
                case 4:
                    System.out.println("Saindo...");
                    exit = true;
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }
    }
}
