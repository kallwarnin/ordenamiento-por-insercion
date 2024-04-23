/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package package1;

import java.util.Scanner;

/**
 *
 *
 */
public class OrdenamientoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de libros que desee: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Libro[] libros = new Libro[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre o titulo del libro " + (i + 1) + ": ");
            String Titulo = scanner.nextLine();
            libros[i] = new Libro(Titulo);
        }

        ordenamientoPorInsercion(libros);

        System.out.println("Libros ordenados alfabeticamente:\n");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }

        scanner.close();
    }

    public static void ordenamientoPorInsercion(Libro[] libros) {
        int n = libros.length;
        for (int i = 1; i < n; i++) {
            Libro nlibro = libros[i];
            int j = i - 1;
            while (j >= 0 && libros[j].getTitulo().compareTo(nlibro.getTitulo()) > 0) {
                libros[j + 1] = libros[j];
                j = j - 1;
            }
            libros[j + 1] =  nlibro;
        }
    }
}
