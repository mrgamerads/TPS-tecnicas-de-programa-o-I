/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpaula06ex02;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author unisanta
 */
public class TPAula06Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> lista1 = new ArrayList();
        lista1.add("Manoel");
        lista1.add("Marcia");
        lista1.add("Manuelly");
        lista1.add("Marjorie");
        
        ArrayList <String> lista2 = new ArrayList();
        lista2.add("Alberto");
        lista2.add("Marta");
        lista2.add("Jorge");
        lista2.add("Mateus");
        lista2.add("Elisvando");
        
        ArrayList <String> merge = new ArrayList();
        merge.addAll(lista1);
        merge.addAll(lista2);
        
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.print(merge);
    }
    
    
    
}
