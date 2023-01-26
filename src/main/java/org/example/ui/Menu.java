package org.example.ui;

import org.example.data.DataTxt;
import org.example.data.GenerarNota;

import java.util.Scanner;

public class Menu{

    public static int respuesta = 0;
    public static Scanner input = new Scanner(System.in);
    public static void mostraMenu(){
        do{
            //el menu
            System.out.println("Generador de notas");
            System.out.println("******************");
            System.out.println("1. registrar nota");
            System.out.println("2. generar nota en TXT");
            System.out.println("0. salir del programa");
            System.out.println("********************");

            respuesta = input.nextInt();

        switch(respuesta){
            case 1:
                GenerarNota.crear();
                break;
            case 2:
                DataTxt.generarTxt();
                break;
        }

        }while(respuesta != 0);
        System.out.println("salio del programa");
    }
}
