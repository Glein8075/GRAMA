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
public class ModeleListLoisir extends AbstractListModel{

    List<String> listeLoisir;
    
    public ModeleListLoisir(){
        listeLoisir= new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listeLoisir.size();
    }

    @Override
    public Object getElementAt(int arg0) {
        return listeLoisir.get(arg0);
    }
    
    public void ajouter(String loisir){
        listeLoisir.add(loisir);
        this.fireIntervalAdded(this, 0, listeLoisir.size());
    }
}
