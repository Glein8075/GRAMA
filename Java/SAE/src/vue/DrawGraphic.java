/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.swing.BorderFactory;
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
    
    public DrawGraphic(Graphe g){
         super();
         graphe = g;
         setBorder(BorderFactory.createLineBorder(Color.black)); 
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D)g;
        Noeud cle;
        int x = 10;
        int y;
        Random nb = new Random();
        Integer[] coordonnee;
        Map<Noeud,Integer[]> listeCoordonnee = new HashMap<>();
        Set<Map.Entry<Noeud,List<Voisin>>> parcours = graphe.getSet();
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            cle = item.getKey();
            x+=27;
            y=30+nb.nextInt(500);
            graph.drawString(cle.toString(), x, y);
            coordonnee = new Integer[]{x,y};
            while(listeCoordonnee.containsValue(coordonnee)){
                coordonnee = new Integer[]{x,y};
            }
            listeCoordonnee.put(cle, coordonnee);
        }
        int i =0;
        List<Noeud> noeudTraite = new ArrayList<>();
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            for(Voisin voisin : item.getValue()){
                if(!noeudTraite.contains(voisin.getDestination())){
                    if(voisin.getRoute().getType().equals("D")){
                    graph.setColor(Color.yellow);
                    graph.drawLine(listeCoordonnee.get(item.getKey())[0], listeCoordonnee.get(item.getKey())[1],
                            listeCoordonnee.get(voisin.getDestination())[0], listeCoordonnee.get(voisin.getDestination())[1]);
                    }
                    else if(voisin.getRoute().getType().equals("N")){
                        graph.setColor(Color.GREEN);
                        graph.drawLine(listeCoordonnee.get(item.getKey())[0], listeCoordonnee.get(item.getKey())[1],
                                listeCoordonnee.get(voisin.getDestination())[0], listeCoordonnee.get(voisin.getDestination())[1]);
                    }
                    else{
                        graph.setColor(Color.BLUE);
                        graph.drawLine(listeCoordonnee.get(item.getKey())[0], listeCoordonnee.get(item.getKey())[1],
                                listeCoordonnee.get(voisin.getDestination())[0], listeCoordonnee.get(voisin.getDestination())[1]);
                    }
                }
                
            }
            noeudTraite.add(item.getKey());
            i++;
        }
        
    }
    
}
