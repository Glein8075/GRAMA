/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
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
     * Map graphe ayant pour clé un objet noeud et comme clé un objet voisin.
     */
    private final Map<Noeud,List<Voisin>> graphe; 
    
    /**
    * Un Set permettant le parcout de la Map graphe pour l'affichage d'élément ou autre.
    */
    Set<Map.Entry<Noeud,List<Voisin>>> parcours;
    
    /**
     * constructeur de la classe Graphe.
     * @param g Map contenant les noeuds et arêtes du graphe
     */
    public Graphe(Map<Noeud,List<Voisin>> g){
        this.graphe = g;
        parcours = graphe.entrySet();
        
    }
    
    public Set getSet(){
        return parcours;
    }
    /**
     * obtention du graphe en entier.
     * @return   
     */
    public Map<Noeud,List<Voisin>> getGraphe(){
        return graphe;
    }
    
    /**
     * affichage de tout les noeuds contenus le graphe.
     */
    public void afficherNoeud(){
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            System.out.println(entree.getKey());
        }
    }
    
    /**
     * obtention du nombre de noeud du graphe
     * @return nombre de noeud
     */
    public int getNbNoeud(){
        return graphe.size();
    }
    
    /**
     * obtention du nombre de ville dans le graphe.
     * @return nombre de noeud de nature "V"
     */
    public int getNbVille(){
        Noeud cle;
        int nbVille = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("V")){
               nbVille++;
           }
        }
        return nbVille;
    }
    
    /**
     * obtention des villes du graphe.
     * @return 
     */
    public List<Noeud> afficherVille(){
        List<Noeud> listVille = new ArrayList<>();
        Noeud cle;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("V")){
               listVille.add(cle);
           }
        }
        return listVille;
    }
    
    /**
     * obtention du nombre de loisir dans le graphe
     * @return nombre de noeud de nature "L"
     */
    public int getNbLoisir(){
        Noeud cle;
        int nbLoisir = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("L")){
               nbLoisir++;
           }
        }
        return nbLoisir;
    }
    
    /**
     * obtention des loisirs du graphe
     * @return 
     */
    public List<Noeud> getLoisir(){
        List<Noeud> listLoisir = new ArrayList<>();
        Noeud cle;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("L")){
               listLoisir.add(cle);
           }
        }
        return listLoisir;
    }
    
    /**
     * obtention du nombre de restaurant dans le graphe.
     * @return nombre de noeud de nature "R"
     */
    public int getNbRestaurant(){
        Noeud cle;
        int nbRestaurant = 0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("R")){
               nbRestaurant++;
           }
        }
        return nbRestaurant;
    }
    
    /**
     * obtention des restaurants du graphe.
     * @return 
     */
    public List<Noeud> getRestaurant(){
        List<Noeud> listResto = new ArrayList<>();
        Noeud cle;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
           cle = entree.getKey();
           if(cle.getNature().equals("R")){
               listResto.add(cle);
           }
        }
        return listResto;
    }
    
    /**
     * obtention du nombre de departementale dans le graphe.
     * @return nombre d'arête de nature "D"
     */
    public int getNbDepartemental(){
        List<Noeud> liste = new ArrayList<>();
        Iterator<Voisin> itv;
        Voisin v;
        int nbDepartemental =0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            itv=entree.getValue().iterator();
            while(itv.hasNext()){
                v=itv.next();
                if (!liste.contains(v.getDestination())){
                    if(v.getRoute().getType().equals("D")){
                        nbDepartemental++;
                    }
                    liste.add(v.getDestination());
                }   
            }	
        }
        return nbDepartemental;
    }
    
    /**
     * obtention du nombre de Nationnale dans le graphe.
     * @return nombre d'arête de nature "N"
     */
    public int getNbNationnal(){
        List<Noeud> liste = new ArrayList<>();
        Iterator<Voisin> itv;
        Voisin v;
        int nbNationnal =0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            itv=entree.getValue().iterator();
            while(itv.hasNext()){
                v=itv.next();
                if (!liste.contains(v.getDestination())){
                    if(v.getRoute().getType().equals("N")){
                        nbNationnal++;
                    }
                    liste.add(v.getDestination());
                }                
            }		
        }
        return nbNationnal;
    }
    
    /**
     * obtention du nombre d'autoroute dans le graphe.
     * @return nombre d'arête de nature "N"
     */
    public int getNbAutoroute(){
        List<Noeud> liste = new ArrayList<>();
        Iterator<Voisin> itv;
        Voisin v;
        int nbAutoroute =0;
        for(Map.Entry<Noeud,List<Voisin>> entree : parcours){
            itv=entree.getValue().iterator();
            while(itv.hasNext()){
                v=itv.next();
                if (!liste.contains(v.getDestination())){
                    if(v.getRoute().getType().equals("A")){
                        nbAutoroute++;
                    }
                    liste.add(v.getDestination());
                }                
            }		
        }
        return nbAutoroute;
    }
    
    /**
     * obtention de la liste tout les voisins à 1-distance d'un sommet entré en paramettre
     * @param sommet instance de la classe Noeud
     * @return 
     */
    public List<Voisin> unDistance(Noeud sommet){
        return graphe.get(sommet);
    }
    
    /**
     * Liste tout les voisins à 2-distance d'un sommet entré en paramettre
     * @param sommet instance de la classe Noeud
     */
    public void deuxDistance(Noeud sommet){
        try{
            if(!graphe.containsKey(sommet)){
                throw new SommetNonPresentException();
            }
            List<Noeud> deuxdist = new ArrayList<>();
            List<Voisin> listVoisin = graphe.get(sommet);
            Iterator<Voisin> itUnSaut = listVoisin.iterator();
            Voisin v;
            while(itUnSaut.hasNext()){
                Iterator<Voisin> itDeuxSaut = graphe.get(itUnSaut.next().getDestination()).iterator();
                while(itDeuxSaut.hasNext()){
                    v=itDeuxSaut.next();
                    System.out.println(listVoisin.contains(v));
                    if(!v.getDestination().equals(sommet)&&!deuxdist.contains(v.getDestination())&&!listVoisin.contains(v))deuxdist.add(v.getDestination());
                }
            }
           for(Noeud items : deuxdist){
                System.out.println(items);
            }
        }catch(SommetNonPresentException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
