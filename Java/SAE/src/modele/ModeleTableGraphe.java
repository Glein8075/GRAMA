/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.AbstractTableModel;
import metier.Graphe;
import metier.Noeud;
import metier.Voisin;

/**
 *
 * @author ASUS
 */
public class ModeleTableGraphe extends AbstractTableModel{
    
    private String[] nomColonne = new String[]{"Noeud","Voisin"};
    
    
    public ModeleTableGraphe(){
        
    }
    
    @Override
    public int getRowCount() {
        
    }

    @Override
    public int getColumnCount() {
        return nomColonne.length;
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        
    }
    
    @Override
    public String getColumnName(int col){
        return nomColonne[col];
    }
}
