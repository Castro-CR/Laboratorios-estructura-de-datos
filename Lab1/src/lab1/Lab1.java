/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author acastro
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        String[] variables = new String[3];
        // ["Uno"]["dos"]["tres"]
        
        int edad1 = 10;
        int edad2 = 22;
        
        boolean esMayor;
        esMayor = edad1 >= 18;
        
        boolean esMayor2 = edad2 >= 18;
        
        System.out.println(
                "Edad1: " + (esMayor ? "Si es mayor" : "Es menor") + "\n" +
                "Edad2: " + (esMayor2 ? "Si es mayor": "Es menor")
        );
        
        
        String nombre = "Anthony";
        variables[0] = nombre;

        
        char inicial = nombre.charAt(0);
        int tamaño = nombre.length();
        char ultimaletra = nombre.charAt(tamaño - 1);
        
        variables[1] = inicial + "";
        variables[2] = ultimaletra + "";
        
        for (String variable : variables) {
            System.out.println(variable);  
        }
        

        
        //Decimales
        int numero = 10;
        float division;
        division = (float) numero / 4;
        System.out.println(division);
    }
    
}
