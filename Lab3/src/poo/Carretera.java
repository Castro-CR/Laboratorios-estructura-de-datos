/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author acastro
 */
public class Carretera {
    private String nombre;
    private ArrayList<Carro> carros;
    

    public Carretera(String nombre) {
        this.nombre = nombre;
        this.carros = new ArrayList();
    }
    
     //agregarCarro
    public void agregarCarro(Carro carro) {
        this.carros.add(carro);
        this.verificarEstado();
    }
    //cantidaddeCarros
    public int cantidadDeCarros() {
        return this.carros.size();
    }
    //verificarEstado
    public void verificarEstado() {
        int cantidad = cantidadDeCarros();
        if (cantidad < 3) {
            System.out.printf("La carretera %s tiene un flujo ligero.\n", this.nombre);
    }
        else if (cantidad < 4) {
            System.out.printf("La carretera %s tiene un flujo moderado.\n", this.nombre);
        }
        else if (cantidad < 5) {
            System.out.printf("La carretera %s está comenzando a congestionarse.\n", this.nombre);
        }
        else  if (cantidad < 6) {
            System.out.printf("Se está generando un embotellamiento en la carretera %s.\n", this.nombre);
        
        }
        else if(cantidad < 7) {
            System.out.printf("La carretera %s está colapsada, hay mucho embotellamiento.\n", this.nombre);
        }
        //switch
    }
    //listarCarros
    public void listarCarros(){
        var it = this.carros.iterator();
        while (it.hasNext()) {
            Carro next = it.next();
            System.out.printf(" %s[%s]\n", next.getMarca(), next.getModelo());
        }
    }
    
    //removerCarrosAntiguos
    
     public void removerCarrosAntiguos(){
        var it = this.carros.iterator();
        while (it.hasNext()) {        
            Carro next = it.next();
            int año = 2025;
            //validar antiguedad del carro.
            if (año > 20){
             System.out.printf(" %s[%s]\n", next.getMarca(), next.getModelo());
            it.remove();
            }
        }
    }
}
