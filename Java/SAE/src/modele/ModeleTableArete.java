/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Arete;

/**
 *
 * @author ASUS
 */
public class ModeleTableArete extends AbstractTableModel{
    
    private final String[] nomColonne = new String[]{"Type","Distance"};
    private final List<Arete> listeArete = new ArrayList<>();
           
    
    @Override
    public int getRowCount() {
        return listeArete.size();
    }

    @Override
    public int getColumnCount() {
        return nomColonne.length;
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        switch(arg1){
            case 0 : return listeArete.get(arg0).getType();
            case 1 : return listeArete.get(arg0).getDistance();
            
        }
        return null;
    }
    
    @Override
    public String getColumnName(int col){
        return nomColonne[col];
    }
    
    public void ajouter(Arete a){
        listeArete.add(a);
        this.fireTableRowsInserted(0, listeArete.size());
    }
}
