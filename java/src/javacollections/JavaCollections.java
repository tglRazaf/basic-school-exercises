/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.javacollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author ANDRY-PC
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>(); // tableau dynamique
        LinkedList<Integer> chainee = new LinkedList<>(); // liste doublement chainée
        PriorityQueue<Integer> fdp = new PriorityQueue<>(); // file de priorité 
        //experimenter SVP !!!         

        for (int i = 0; i < 100; i++) {
            liste.add((int)(i*Math.random()*100));
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(liste.get(i));
        }
    }
    
}
