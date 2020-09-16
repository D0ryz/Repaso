/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.tienda;

import java.util.ArrayList;
import udem.edu.co.tienda.electrodomesticos.Televisor;
import udem.edu.co.tienda.electrodomesticos.interfaces.Electrodomestico;

/**
 *
 * @author DisCor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Televisor(50, 2000000, "negro", "30 KW", 20));
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico);
        }
    }
    
}
