/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Somador;

public class Somador extends Thread {
    private int v[];
    private volatile int soma; 
    
    public Somador(int v[]){
        this.v = v; 
    }
    
    @Override
    public void run(){
        int total = 0;
        for(int i : v){
            total += i; 
        }
        soma = total; 
    }
    
    public int getSoma(){
        return soma; 
    }
}