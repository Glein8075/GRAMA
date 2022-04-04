/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

import java.util.Objects;

/**
 * classe regrouppant les aretes
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class Arete {
    
    /**
     * type de l'arête ("D"=départementale, "N"=nationnale, "A"=autoroute)
     */
    private final String type;
    
    /**
     * distance de la route (poids de l'arête)
     */
    private final int distance;
    
    /**
     * constructeur de la classe Arete
     * @param type type de la route/arête
     * @param distance distance/longueur de la route/poids de l'arête
     */
    public Arete(String type, int distance){
        this.type=type;
        this.distance=distance;
    }
    
    /**
     * méthode d'affichage des informations d'une arête
     * @return descritption complete d'une arête
     */
    @Override
    public String toString(){
        return type+", "+distance;
    }
    
    /**
     * obtention du type de l'arête
     * @return renvoie le type
     */
    public String getType(){
        return type;
    }
    
    /**
     * obtention de la distance/longueur de l'arête
     * @return renvoie la distance de l'arête
     */
    public int getDistance(){
        return distance;
    }
    
    /**
     * méthode de hashage
     * @return résultat de la méthode hash de la classe Objects
     */
    @Override
    public int hashCode(){
        return Objects.hash(type,distance);
    }
    
    /**
     * méthode de comparaison
     * @param o Objet de la classe Object
     * @return "true" si les attribues des objets sont égaux et que l'objet o est une instance de la classe Arête, sinon "false"
     */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Arete)){
            return false;
        }
        Arete n = (Arete)o;
        return this.type.equals(n.type) && this.distance==n.distance;
    }
}
