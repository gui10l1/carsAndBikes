/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsandbikes;

import classes.Carro;
import classes.Moto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class CarsAndBikes {
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean running = true;
        String option;
        String modelo;
        double preco;
        
        ArrayList<Carro> carros = new ArrayList();
        ArrayList<Moto> motos = new ArrayList();
        
        do {
            System.out.println("* * * * * * * * * * * * * * ");
            System.out.println("Selecione o que deseja fazer");
            System.out.println("* * * * * * * * * * * * * * ");
            System.out.println("[1] Cadastrar carro");
            System.out.println("[2] Cadastrar moto");
            System.out.println("[3] Fazer relatório");
            System.out.println("[4] Finalizar programa");
            option = scanner.nextLine();
            
            switch (option) {
                case "1":
                    System.out.print("Insira o modelo do carro: ");
                    modelo = scanner.nextLine();
                    System.out.print("Insira o preco do carro: ");
                    preco = Double.parseDouble(scanner.nextLine());
                    
                    Carro carro = new Carro(modelo, preco, 0);
                    
                    carro.insertData();
                    
                    carros.add(carro);
                    
                    System.out.println("* * * * * * * * * * * * *");
                    System.out.println("Dados do carro cadastrado");
                    System.out.println("* * * * * * * * * * * * *");
                    carro.printDados();
                    break;
                    
                case "2":
                    System.out.print("Insira o modelo da moto: ");
                    modelo = scanner.nextLine();
                    System.out.print("Insira o preco da moto: ");
                    preco = Double.parseDouble(scanner.nextLine());
                    
                    Moto moto = new Moto(modelo, preco, 0);
                    
                    moto.insertData();
                    
                    motos.add(moto);
                    
                    System.out.println("* * * * * * * * * * * * ");
                    System.out.println("Dados da moto cadastrada");
                    System.out.println("* * * * * * * * * * * * ");
                    moto.printDados();
                    break;
                
                case "3":
                    double total = 0;
                    
                    for (int i = 0; i < carros.size(); i++) {
                        Carro carroRecuperado = carros.get(i);
                        
                        if (carroRecuperado.getKm() > 100000) {
                            double precoRecuperado = carroRecuperado.getPreco();
                            double precoASerDiminuido = precoRecuperado * .08;
                            
                            total += precoRecuperado - precoASerDiminuido;
                        } else {
                            total += carroRecuperado.getPreco();
                        }
                    }
                    
                    for (int i = 0; i < motos.size(); i++) {
                        Moto motoRecuperada = motos.get(i);
                        
                        if (motoRecuperada.getAno() > 2008) {
                            double precoRecuperado = motoRecuperada.getPreco();
                            double precoASerAumentado = precoRecuperado * .1;
                            
                            total += precoRecuperado + precoASerAumentado;
                        } else {
                            total += motoRecuperada.getPreco();
                        }
                    }
                    
                    System.out.println("* * * * * * * * * * * * * ");
                    System.out.println("Preco total apos reajustes");
                    System.out.println("* * * * * * * * * * * * * ");
                    System.out.printf("R$ %.2f\n", total);
                    break;
                    
                case "4":
                    running = false;
                    break;
                    
                default:
            }
        } while (running);
    }
    
}
