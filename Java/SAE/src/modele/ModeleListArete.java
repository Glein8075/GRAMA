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
public class ModeleListArete extends AbstractListModel{

    private final List<String> listArete;
    
    public ModeleListArete(){
        listArete=new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listArete.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listArete.get(arg0);
    }
    
    public void ajouter(String arete){
        listArete.add(arete);
        this.fireIntervalAdded(this, 0, listArete.size());
    }
}
