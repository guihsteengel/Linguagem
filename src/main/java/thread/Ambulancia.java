/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;


public class Ambulancia implements Runnable {
    
    private String ambulancia;
    
    public Ambulancia(String ambulancia){
        this.ambulancia = ambulancia;
    }
    
    @Override
    public void run(){
        System.out.println("Iniciou o run()" + ambulancia);
        
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000);
                System.out.println("Na " + ambulancia + " " + i);
            } catch (InterruptedException ex) {
            }

        }
    }
    
}
