/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class ModeleTableInfo extends AbstractTableModel{
    
    private final String[] nomColonne = new String[]{"nombre de noeud","nombre de ville","nombre de restaurant","nombre de loisir","nombre de départementale","nombre de nationnale","nombre d'autoroute"};
    private List<List<Integer>> listeInfo = new ArrayList<>();
    
    public ModeleTableInfo(List<List<Integer>> liste){
        listeInfo=liste;
    }
    
    @Override
    public int getRowCount() {
        return listeInfo.size();
    }

    public void ajouter(List<Integer> liste){
        listeInfo.add(liste);
        this.fireTableRowsInserted(0, listeInfo.size());
    }
    
    @Override
    public int getColumnCount() {
        return nomColonne.length;
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        return listeInfo.get(arg0).get(arg1);
    }
    
    @Override
    public String getColumnName(int col){
        return nomColonne[col];
    }
}
