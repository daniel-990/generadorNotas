package org.example.data;

import org.example.conexion.Conector;
import org.example.controllers.ControllerNotas;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.example.controllers.ControllerNotas.con;

public class DataTxt {
    public static Conector conector = new Conector();
    public static ControllerNotas notas = new ControllerNotas();
    public static String sql;
    public static PreparedStatement ps;
    public static String render;

    public static void generarTxt(){
        try{
            sql = "SELECT * FROM usuario";
            ps = conector.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                String ruta = "_txt/final_nota_"+rs.getInt("id")+".txt";
                String contenido = rs.getString("fecha")+"\n"+
                        "-------"+rs.getString("nombre")+"-----" +
                        "\n" +
                        "             _.-````'-,_\n" +
                        "   _,.,_ ,-'`           `'-.,_\n" +
                        " /)     (\\                   '``-.\n" +
                        "((      ) )                      `\\\n" +
                        " \\)    (_/                        )\\\n" +
                        "  |       /)           '    ,'    / \\\n" +
                        "  `\\    ^'            '     (    /  ))\n" +
                        "    |      _/\\ ,     /    ,,`\\   (  \"`\n" +
                        "     \\Y,   |  \\  \\  | ````| / \\_ \\\n" +
                        "       `)_/    \\  \\  )    ( >  ( >\n" +
                        "                \\( \\(     |/   |/\n" +
                        "    Notas - Bison  /_(/_(    /_(  /_(\n" +
                        "\n" +
                        "------------------------------------------------\n" +
                        "* Daniel Arango Villegas *\n" +
                        "* Generador de notas *\n" +
                        "* https://github.com/daniel-990 *\n" +
                        "--\n" +
                        rs.getString("nombre")+"\n" +
                        "-------------------------------\n" +
                        rs.getString("autor")+"\n" +
                        "-------------------------------\n" +
                        rs.getString("contenido")+"\n" +
                        "-------------------------------\n" +
                        "Fecha: "+rs.getString("fecha")+"\n" +
                        "-------------------------------\n";
                File file = new File(ruta);
                if(file.exists()){
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(contenido);
                bw.close();
            }
            System.out.println("la nota se genero con exito");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
