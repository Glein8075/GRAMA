/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import metier.Graphe;
import metier.Noeud;
import metier.Voisin;

/**
 *
 * @author ASUS
 */
public class DrawGraphic extends JPanel{

    private Graphe graphe;
    
    public DrawGraphic(Graphe g){
        graphe = g;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D)g;
        Noeud cle;
        double x = 0.0;
        double y;
        Set<Map.Entry<Noeud,List<Voisin>>> parcours = graphe.getSet();
        for(Map.Entry<Noeud,List<Voisin>> item : parcours){
            cle = item.getKey();
            x+=50.0;
            y=Math.random();
            graph.drawString(cle.getNature()+", "+cle.getNom(), x, y);
        }
        
    }
    
}
