package semThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Tarefa tarefa1 = new Tarefa(" 1");
        Tarefa tarefa2 = new Tarefa(" 2");
        tarefa1.run();
        tarefa2.run();
        System.out.println("Main terminou");
    }

}
