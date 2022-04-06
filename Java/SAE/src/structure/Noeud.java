/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

import java.util.Objects;

/**
 * classe regrouppant les noeuds.
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class Noeud {
    
    /**
     * nature du noeud.
     */
    private final String nature;
    
    /**
     * nom du noeud.
     */
    private final String nom;
    
    /**
     * constructeur de la classe noeud
     * @param nature nature du noeud
     * @param nom nom du noeud
     */
    public Noeud(String nature, String nom){
        this.nature=nature;
        this.nom=nom;
    }
    
    /**
     * méthode d'affichage des informations d'un noeud
     * @return descritption complete d'un noeud
     */
    @Override
    public String toString(){
        return nature+", "+nom;
    }
    
    /**
     * obtention de la nature du noeud
     * @return renvoie la nature du noeud
     */
    public String getNature(){
        return nature;
    }
    
    /**
     * obtention du nom du noeud
     * @return renvoie le nom du noeud
     */
    public String getNom(){
        return nom;
    }
    
    /**
     * méthode de hashage
     * @return résultat de la méthode hash de la classe Objects
     */
    @Override
    public int hashCode(){
        return Objects.hash(nature,nom);
    }
    
    /**
     * méthode de comparaison
     * @param o Objet de la classe Object
     * @return "true" si les attribues des objets sont égaux et que l'objet o est une instance de la classe Arête, sinon "false"
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Noeud)){
            return false;
        }
        Noeud n = (Noeud)o;
        return this.nature.equals(n.nature) && this.nom.equals(n.nom);
    }
}
