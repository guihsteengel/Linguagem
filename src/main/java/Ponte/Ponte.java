/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ponte;


public class Ponte {
    
    public synchronized void atravessar(Veiculo v) throws InterruptedException{
        System.out.println(v.getName()+ " está passando");
        Thread.sleep(1000);
        System.out.println("");
    }

}