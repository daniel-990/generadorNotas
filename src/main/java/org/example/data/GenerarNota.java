package org.example.data;

import org.example.controllers.ControllerNotas;

import java.util.Scanner;

public class GenerarNota {
    public static Scanner input = new Scanner(System.in);
    public static String nombre;
    public static String autor;
    public static String contenido;
    public static void crear(){
        System.out.println("ingrese nombre");
        nombre = input.nextLine();
        System.out.println("ingrese autor");
        autor = input.nextLine();
        System.out.println("ingrese contenido");
        contenido = input.nextLine();

        ControllerNotas enviar = new ControllerNotas();
        enviar.insertar(autor,nombre, contenido);
    }
}
