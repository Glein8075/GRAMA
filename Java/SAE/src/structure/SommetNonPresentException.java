/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structure;

/**
 * Exception si un sommet recherché n'est pas dans le graphe
 * @author Valentin SEGALLA, Ilyes BEIRADE
 */
public class SommetNonPresentException extends Exception {

    public SommetNonPresentException() {
        super("le sommet n'est pas dans le graphe");
    }
    
}
