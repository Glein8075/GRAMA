/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author ASUS
 */
public class ModeleListResto extends AbstractListModel{

    List<String> listeResto;
    
    public ModeleListResto(){
        listeResto= new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listeResto.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listeResto.get(arg0);
    }
    
    public void ajouter(String resto){
        listeResto.add(resto);
        this.fireIntervalAdded(this, 0, listeResto.size());
    }
}
