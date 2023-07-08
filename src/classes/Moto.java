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
public class Moto extends Veiculos {
    static Scanner scanner = new Scanner(System.in);
    
    private int ano;
    
    public Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco();
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    
    public void insertData() {
        System.out.print("Insira o ano da moto: ");
        this.setAno(Integer.parseInt(this.scanner.nextLine()));
    }
}
