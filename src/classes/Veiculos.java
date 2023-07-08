/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Gui
 */
public class Veiculos {
    private String modelo;
    
    private double preco;
    
    public Veiculos(
        String modelo,
        double preco
    ) {
        this.preco = preco;
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }
    
    public void printDados() {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Preco: "+this.preco);
    }
}
