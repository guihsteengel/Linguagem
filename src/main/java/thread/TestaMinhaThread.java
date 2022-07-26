package thread;

public class TestaMinhaThread {

    public static void main(String[] args) {
        Carro c1 = new Carro("Comum 1");
        Thread t1 = new Thread(c1);
        Ambulancia a1 = new Ambulancia("Ambulancia 1");
        Carro c2 = new Carro("Comum 2");
        Thread t2 = new Thread(c2);
        Policia p1 = new Policia("Policia 1");
        Thread t3 = new Thread(p1);
        
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(7);
        
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
        }
        System.out.println("Main terminou");

    }
}
