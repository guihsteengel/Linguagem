/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;


public class Carro implements Runnable{
    private String carro;
    
    public Carro(String carro){
        this.carro = carro;
    }
    
    @Override
    public void run(){
        System.out.println("Iniciou o run()" + carro);
        
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000);
                System.out.println("Na " + carro + " " + i);
            } catch (InterruptedException ex) {
            }

        }
    }
    
}
