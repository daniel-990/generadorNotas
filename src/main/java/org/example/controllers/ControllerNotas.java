package org.example.controllers;

import org.example.conexion.Conector;
import org.example.models.ModelNotas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ControllerNotas {
    public static ModelNotas nota = new ModelNotas();
    public static Conector conectar = new Conector();
    public static Connection con = conectar.getConnection();
    public static String Sql;
    public static PreparedStatement ps;

    public void insertar(String nombre, String contenido, String autor){

        nota.setAutorNota(autor);
        nota.setContenidoNota(contenido);
        nota.setNombreNota(nombre);

        try{
            Sql = "INSERT INTO usuario (autor, nombre, contenido) VALUES ('"+nota.getAutorNota()+"','"+nota.getNombreNota()+"','"+nota.getContenidoNota()+"')";
            ps = con.prepareStatement(Sql);
            ps.executeUpdate();
            System.out.println("se cargaron los datos en base de datos");
        }catch (Exception e){
            System.out.println("no se genero la nota"+ e);
        }
    }
}
