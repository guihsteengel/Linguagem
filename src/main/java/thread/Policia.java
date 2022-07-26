/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;


public class Policia implements Runnable {
    
private String policia;
    
    public Policia(String policia){
        this.policia = policia;
    }
    
    @Override
    public void run(){
        System.out.println("Iniciou o run()" + policia);
        
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000);
                System.out.println("Na " + policia + " " + i);
            } catch (InterruptedException ex) {
            }

        }
    }
}