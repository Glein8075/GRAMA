/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import metier.Graphe;
import metier.Noeud;
import metier.Voisin;

/**
 * Classe pour dessiner le graphe
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class DrawGraphic extends JPanel{

    private final Graphe graphe;
    
    /**
     * constructeur de la classe
     * @param g 
     */
    public DrawGraphic(Graphe g){
         super();
         graphe = g;
    }
    
    /**
     * methode permettant de dessiner le graphe
     * @param g Objet de la classe Graphics
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D)g;
        Map<Noeud,Integer[]> coordonneeNoeud = this.dessinerNoeud(graph);
        this.dessinerArete(coordonneeNoeud, graph);
    }
    
    /**
     * methode pour dessiner les noeuds du graphe
     * @param graph Objet Graphics2D permettant de dessiner dans la vue
     * @return map contenant comme clé les noeuds du graphe et comme valeur les coordonnées de ceux-ci
     */
    public Map<Noeud,Integer[]> dessinerNoeud(Graphics2D graph){
        Noeud cle;
        int x = 20;
        int y=30;
        Integer[] coordonnee;
        Map<Noeud,Integer[]> listeCoordonnee = new HashMap<>();
        Set<Map.Entry<Noeud,List<Voisin>>> parcours = graphe.getSet();
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            cle = item.getKey();
            
            graph.drawOval(x, y, 5, 5);
            graph.drawString(cle.toString(), x-15, y-5);
            coordonnee = new Integer[]{x,y};
            while(listeCoordonnee.containsValue(coordonnee)){
                coordonnee = new Integer[]{x,y};
            }
            listeCoordonnee.put(cle, coordonnee);
            if(x<=1100 && y<=30){
                x+=125;
            }
            else if(x>1000 && y<=600){
                y+=50;
            }
            else if(x>30 && y>600){
                x-=125;
            }
            else if(x<=30 && y>130){
                y-=50;
            }
        }
        return listeCoordonnee;
    }
    
    /**
     * methode permettant de dessiner les arêtes du graphe
     * @param coordonneeNoeud map contenant comme clé les noeuds du graphe et comme valeur les coordonnées de ceux-ci
     * @param graph Objet Graphics2D permettant de dessiner dans la vue
     */
    public void dessinerArete(Map<Noeud,Integer[]> coordonneeNoeud, Graphics2D graph){
        int i =0;
        int x1;
        int x2;
        int y1;
        int y2;
        int xMilieu;
        int yMilieu;
        Set<Map.Entry<Noeud,List<Voisin>>> parcours = graphe.getSet();
        List<Noeud> noeudTraite = new ArrayList<>();
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            for(Voisin voisin : item.getValue()){
                //coordonnée du noeud de départ
                x1=coordonneeNoeud.get(item.getKey())[0];
                y1=coordonneeNoeud.get(item.getKey())[1];
                //coordonnée du noeud d'arrivée
                y2=coordonneeNoeud.get(voisin.getDestination())[1];
                x2=coordonneeNoeud.get(voisin.getDestination())[0];
                xMilieu=(x1+x2)/2;
                yMilieu=(y1+y2)/2;
                if(!noeudTraite.contains(voisin.getDestination())){
                    switch (voisin.getRoute().getType()) {
                        case "D":
                            graph.setColor(Color.RED);
                            graph.drawLine(x1,y1,x2,y2);
                            
                            graph.drawString(voisin.getRoute().toString(),xMilieu,yMilieu+10);
                            break;
                        case "N":
                            graph.setColor(Color.orange);
                            graph.drawLine(x1+5,y1+5,x2+5,y2+5);
                            
                            graph.drawString(voisin.getRoute().toString(),xMilieu,yMilieu);
                            break;
                        case "A":
                            graph.setColor(Color.BLUE);
                            graph.drawLine(x1-5,y1-5,x2-5,y2-5);
                            
                            graph.drawString(voisin.getRoute().toString(),xMilieu,yMilieu-10);
                            break;
                    }
                }
                
            }
            noeudTraite.add(item.getKey());
            i++;
        }
        
    }
    
}
