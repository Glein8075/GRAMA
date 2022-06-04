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
public class ModeleListNDistance extends AbstractListModel{

    private final List<String> listeVoisin;
    
    public ModeleListNDistance(){
        listeVoisin=new ArrayList<>();
    }

    @Override
    public int getSize() {
        return listeVoisin.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listeVoisin.get(arg0);
    }
    
    public void ajouter(String voisin){
        listeVoisin.add(voisin);
        this.fireIntervalAdded(this, 0, listeVoisin.size());
    }
    
    public void vider(){
        if(!listeVoisin.isEmpty()){
            listeVoisin.clear();
            this.fireIntervalRemoved(this, 0, listeVoisin.size());
        }
    }
}
