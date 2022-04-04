/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

/**
 * classe regrouppant les voisins
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class Voisin /*implements Iterator*/{
    private final Arete route;
    private final Noeud destination;
    
    public Voisin(String nata, int longueur, String natn, String nom){
        route=new Arete(nata, longueur);
        destination = new Noeud(natn, nom);
    }
    
    /**
     * méthode d'affichage des informations d'un voisin
     * @return descritption complete d'un voisin
     */
    @Override
    public String toString(){
        return route.toString()+"; "+destination.toString();
    }
}
