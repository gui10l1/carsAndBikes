/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class Carro extends Veiculos {
    static private Scanner scanner = new Scanner(System.in);
    
    private double km;
    
    public Carro(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }
    
    @Override()
    public double getPreco() {
        return super.getPreco();
    }
    
    public void setKm(double km) {
        this.km = km;
    }
    
    public double getKm() {
        return this.km;
    }
    
    public void insertData() {
        System.out.print("Insira o km do carro: ");
        this.setKm(Double.parseDouble(this.scanner.nextLine()));
    }
}
