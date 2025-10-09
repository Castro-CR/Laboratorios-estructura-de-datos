/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import poo.Carretera;
import poo.Carro;
import poo.Garaje;

/**
 *
 * @author acastro
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Yaris");
        c1.setColor("Verde");
        System.out.println(c1.toString());
        
        Carro c2 = new Carro("Ford","Bronco","Negro",2024);
        c2.setAño(2020); 
        System.out.println(c2.toString());
        
        Carro c3 = new Carro("Ford","Mustang","Blanco",1990);
        c3.setAño(2020);
        System.out.println(c3.toString());
        
        Carro c4 = new Carro("Chevrolet","Camaro","Negro",2025);
        c4.setAño(2020);
        System.out.println(c4.toString());
        
        Carro c5 = new Carro("Hyundai","Elantra","Naranja",2019);
        c5.setAño(2020);
        System.out.println(c5.toString());
        
        Carro c6 = new Carro("BMW","M4 COMPETION","Gris",2020);
        c6.setAño(2020);
        System.out.println(c6.toString());
        
        Garaje miGaraje = new Garaje (2);
        miGaraje.aparcarCarro(c1);
        miGaraje.aparcarCarro(c2);
        miGaraje.aparcarCarro(c3);
        
        Carretera c = new Carretera("General Cañas");
        c.agregarCarro(c1);
        c.agregarCarro(c2);
        c.agregarCarro(c3);
        c.agregarCarro(c4);
        c.agregarCarro(c5);
        c.agregarCarro(c6);
        c.listarCarros();

    }
    
}
