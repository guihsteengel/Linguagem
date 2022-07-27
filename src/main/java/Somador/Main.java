/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Somador;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int v[] = new int[1_000_000]; 
        for (int i = 0; i < 1_000_000; i++){
            v[i] = random.nextInt();
        }     
         
        int v2[] = new int[1_000_000]; 
        for (int i = 0; i < 1_000_000; i++){
            v2[i] = random.nextInt();
        }
        
        Somador s1 = new Somador(v);
        Somador s2 = new Somador(v2); 
        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println(s1.getSoma() + s2.getSoma());