/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class Fichier {
    public static Map<Noeud,List<Voisin>> DécoupageFichier(String nomFichier) throws FileNotFoundException, IOException{
        Map<Noeud,List<Voisin>> graphe = new HashMap<>();
        
        List<Voisin> listVoisin ;
        String[] contenuLigne;
        Noeud n;
        Voisin v;
        String[] noeud;
        String[] arete;
        String[] dest;
        String[] voisin; 
        try(BufferedReader buff = new BufferedReader(new FileReader(nomFichier))){
            String uneLigne;
            while ((uneLigne = buff.readLine())!=null){
                contenuLigne = uneLigne.split(";");
                listVoisin= new ArrayList<>();
                noeud=contenuLigne[0].split(":");
                noeud=noeud[0].split(",");
                n=new Noeud(noeud[0],noeud[1]);
                for(String item : contenuLigne){
                    if (!(item.equals("")) && !(item.equals(contenuLigne[0]))){
                        voisin = item.split(":");
                            arete=voisin[0].split(",");
                            dest=voisin[2].split(",");
                            v=new Voisin(arete[0],Double.valueOf(arete[1]),dest[0],dest[1]);
                            listVoisin.add(v);
                            graphe.put(n, listVoisin); 
                        }
                    else if (item.equals(contenuLigne[0])) {
                        voisin = item.split(":");
                        arete = voisin[1].split(",");
                        dest = voisin[3].split(",");
                        v=new Voisin(arete[0],Double.valueOf(arete[1]),dest[0],dest[1]);
                        listVoisin.add(v);
                        graphe.put(n, listVoisin);   
                    }
                }     
            }    
            
        }
        return graphe;
    }
}
