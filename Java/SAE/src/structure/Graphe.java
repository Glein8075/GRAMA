/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * classe permettant de créer et manipuler le graphe
 * @author Valentin SEGALLA, Ilyes BEIRADE
 * @version 1.0
 */
public class Graphe {
   
    /**
     * Map graphe ayant pour clé un objet noeud et comme clé un objet voisin
     */
    private Map<Noeud,List<Voisin>> graphe; 
    
    /**
    * Un Set permettant le parcout de la Map graphe pour l'affichage d'élément ou autre
    */
    Set<Map.Entry<Noeud,List<Voisin>>> parcours = graphe.entrySet();
    
    /**
     * constructeur de la classe Graphe
     * @param graphe Map contenant les noeuds et arêtes du graphe
     */
    public Graphe(Map<Noeud,List<Voisin>> graphe){
        this.graphe = graphe;
        
    }
    
    /**
     * méthode d'affichage du graphe en entier
     * @return descritption complete du graphe
     */
    @Override
    public String toString(){
        return "";
    }
    
    /**
     * obtention de tout les noeuds composant le graphe
     */
    public void getNoeud(){
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            System.out.println(entree.getKey());
        }
    }
    
    /**
     * obtention du nombre de ville dans le graphe
     * @return nombre de noeud de nature "V"
     */
    public int getNbVille(){
        Noeud cle;
        int n = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("V")){
               n++;
           }
        }
        return n;
    }
    
    /**
     * obtention du nombre de loisir dans le graphe
     * @return nombre de noeud de nature "L"
     */
    public int getNbLoisir(){
        Noeud cle;
        int n = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("L")){
               n++;
           }
        }
        return n;
    }
    
    /**
     * obtention du nombre de restorant dans le graphe
     * @return nombre de noeud de nature "R"
     */
    public int getNbResto(){
        Noeud cle;
        int n = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("R")){
               n++;
           }
        }
        return n;
    }
    
    /**
     * obtention du nombre de departementale dans le graphe
     * @return nombre d'arête de nature "D"
     */
    public int getNbDepartemental(){
        List<Noeud> liste ;
        Iterator<Voisin> itv;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            itv=entree.getValue().iterator();
            /*while()
				if ([maillon.noeud.nom,voisin.destination.nom] not in liste or [voisin.destination.nom,maillon.noeud.nom] not in liste) and voisin.route.nature=="N":
					liste.append([maillon.noeud.nom,voisin.destination.nom])
				voisin=voisin.v_suiv
			maillon=maillon.suivant*/
		
        }
        return 0;
    }
}
