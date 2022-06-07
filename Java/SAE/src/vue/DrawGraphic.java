/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
 *
 * @author ASUS
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
            x+=30;
            y=nb.nextInt(100);
            graph.drawString(cle.toString(), x, y);
            coordonnee = new Integer[]{x,y};
            listeCoordonnee.put(cle, coordonnee);
        }
        int i =0;
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            for(Voisin voisin : item.getValue()){
                graph.drawLine(listeCoordonnee.get(item.getKey())[0], listeCoordonnee.get(item.getKey())[1], listeCoordonnee.get(voisin.getDestination())[0], listeCoordonnee.get(voisin.getDestination())[0]);
            }
            i++;
        }
        
    }
    
}
