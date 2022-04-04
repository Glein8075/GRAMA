/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import structure.Noeud;
import structure.Voisin;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Map<Noeud,List<Voisin>> graphe = new HashMap<>();
        List<Voisin> listVoisin ;
        String[] contenuLigne;
        Noeud n;
        Voisin v;
        String[] noeud;
        String[] arete;
        String[] dest;
        try(BufferedReader buff = new BufferedReader(new FileReader("Graphe.csv"))){
            String uneLigne;
            while ((uneLigne = buff.readLine())!=null){
                noeud=new String[2];
                contenuLigne = uneLigne.split(":");
                listVoisin= new ArrayList<>();
                noeud=contenuL.split(",");
                n=new Noeud(noeud[0],noeud[1]);
                for(String item : contenuLigne){
                    arete=new String[2];
                    dest=new String[2];
                    if (!(item.equals(""))){
                        if(item.startsWith("A")||item.startsWith("N")||item.startsWith("D")){
                            arete=item.split(",");
                        }
                        else if(item.startsWith("V")||item.startsWith("L")||item.startsWith("R")){
                            dest=item.split(",");
                        }
                    }
                    if(arete!=null&&dest!=null){
                        v=new Voisin(arete[0],Integer.parseInt(arete[1]),dest[0],dest[1]);
                        listVoisin.add(v);
                        graphe.put(n, listVoisin);
                    }
                    
                    /*for (String info : noeud){
                        System.out.println(info);
                        }*/
                }
                
                        
                        
            }
        }
        //Graphe g = new Graphe(graphe);        
        
    }
}
