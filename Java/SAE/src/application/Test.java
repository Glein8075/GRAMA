/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import metier.Fichier;
import metier.Graphe;
import metier.Noeud;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Graphe g = new Graphe(Fichier.DécoupageFichier("Graphe.csv"));
        System.out.println(g.getNbVille());
        
    }
          
}
        
        
