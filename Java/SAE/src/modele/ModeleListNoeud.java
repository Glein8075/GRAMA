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
public class ModeleListNoeud extends AbstractListModel{

    private final List<String> listNoeud;
    
    public ModeleListNoeud(){
        listNoeud=new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listNoeud.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listNoeud.get(arg0);
    }
    
    public void ajouter(String noeud){
        listNoeud.add(noeud);
        this.fireIntervalAdded(this, 0, listNoeud.size());
    }
}
