/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ponte;

public class Veiculo extends Thread {
    Ponte ponte;
    
    public Veiculo(String nome, Ponte p){
        this.setName(nome);
        this.ponte = p;
    }
    
    @Override
    public void run(){
        try {
            ponte.atravessar(this);
        } catch (InterruptedException ex) {
            
        }
    }

   
    
}