/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ponte;

public class Main {
    public static void main(String[] args) {
        Ponte p = new Ponte();
        Veiculo v1 = new Veiculo("Carro", p);
        Veiculo v2 = new Veiculo("Carro", p);
        Veiculo v3 = new Veiculo("Polícia", p);
        v3.setPriority(9);
        Veiculo v4 = new Veiculo("Ambulância", p);
        v4.setPriority(10); 
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        
    }
}
