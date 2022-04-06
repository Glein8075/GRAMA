/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

/**
 * classe regrouppant les voisins.
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class Voisin /*implements Iterator*/{
    
    /**
     * attribue route étant un objet de la classe Arête.
     */
    private final Arete route;
    
    /**
     * attribue destination étant un objet de la classe Noeud.
     */
    private final Noeud destination;
    
    /**
     * constructeur de la classe Voisin
     * @param nata nature de l'arête
     * @param longueur longueur / distance de l'arête (son poids)
     * @param natn nature du noeud
     * @param nom nom du noeud 
     */
    public Voisin(String nata, double longueur, String natn, String nom){
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
