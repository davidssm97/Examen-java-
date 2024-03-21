package examenJava;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] resultados = new double[2][3]; // almacenar resultados

        System.out.println("Bienvenido al programa de Figuras Geométricas");

        // creo el menu principal
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Calcular para Rectángulo");
            System.out.println("2. Calcular para Cuadrado");
            System.out.println("3. Mostrar resultados");
            System.out.println("4. Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese las dimensiones del rectángulo:");
                    System.out.print("Alto: ");
                    double altoRectangulo = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ancho: ");
                    double anchoRectangulo = scanner.nextDouble();
                    scanner.nextLine();

                    // crear objeto Rectangulo y calcular resultados
                    Rectangulo rectangulo = new Rectangulo(altoRectangulo, anchoRectangulo);
                    resultados[0][0] = rectangulo.calcularArea();
                    resultados[0][1] = rectangulo.calcularPerimetro();
                    resultados[0][2] = rectangulo.calcularHipotenusa();
                    break;

                case 2:
                    System.out.println("\nIngrese el lado del cuadrado:");
                    System.out.print("Lado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    scanner.nextLine();

                    // crear objeto Cuadrado y calcular resultados
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    resultados[1][0] = cuadrado.calcularArea();
                    resultados[1][1] = cuadrado.calcularPerimetro();
                    resultados[1][2] = cuadrado.calcularHipotenusa();
                    break;

                case 3:
                    // imprimo resultados
                    System.out.println("\nResultados:");
                    System.out.println("Rectángulo:");
                    System.out.println("Área: " + resultados[0][0]);
                    System.out.println("Perímetro: " + resultados[0][1]);
                    System.out.println("Hipotenusa: " + resultados[0][2]);
                    System.out.println("\nCuadrado:");
                    System.out.println("Área: " + resultados[1][0]);
                    System.out.println("Perímetro: " + resultados[1][1]);
                    System.out.println("Hipotenusa: " + resultados[1][2]);
                    break;

                case 4:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

    }
}