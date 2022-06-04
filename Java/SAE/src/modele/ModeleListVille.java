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
public class ModeleListVille extends AbstractListModel{

    List<String> listeVille;
    
    public ModeleListVille(){
        listeVille= new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listeVille.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listeVille.get(arg0);
    }
    
    public void ajouter(String ville){
        listeVille.add(ville);
        this.fireIntervalAdded(this, 0, listeVille.size());
    }
}
