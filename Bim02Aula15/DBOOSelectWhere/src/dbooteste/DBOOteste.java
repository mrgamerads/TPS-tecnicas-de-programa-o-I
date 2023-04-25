/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbooteste;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;



/**
 *
 * @author MauricioAsenjo
 */
public class DBOOteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Procedimento para inserção de dados no banco
        // Declaração de objetos necessários
        Livro umlivro = new Livro();
        ObjectContainer db;
        
        db = Db4o.openFile("meubanco.dbo");
        umlivro.setTitulo("2");
        umlivro.setAutor("2");
        umlivro.setEditora("2");
        umlivro.setAnoEdicao("2");
        umlivro.setLocalizacao("2");
        db.set(umlivro);
        db.close();

        db = Db4o.openFile("meubanco.dbo");
        umlivro.setTitulo("1");
        umlivro.setAutor("1");
        umlivro.setEditora("1");
        umlivro.setAnoEdicao("1");
        umlivro.setLocalizacao("1");
        db.set(umlivro);
        db.close();
        
        db = Db4o.openFile("meubanco.dbo");
        umlivro.setTitulo("Usando BDOO em JAVA");
        umlivro.setAutor("Maurício Asenjo");
        umlivro.setEditora("UNISANTA");
        umlivro.setAnoEdicao("2015");
        umlivro.setLocalizacao("Santos/SP");
        db.set(umlivro);
        db.close();

       
        // Procedimento para consulta no dados no banco
        // Declaração de objetos necessários
        ObjectSet<Livro> lista;
        
        
        db = Db4o.openFile("meubanco.dbo");
        
        umlivro.setTitulo("Usando BDOO em JAVA");
        umlivro.setAutor(null);
        umlivro.setEditora(null);
        umlivro.setAnoEdicao(null);
        umlivro.setLocalizacao(null);
        
        lista = db.get(umlivro); 
        while (lista.hasNext()){
            umlivro = lista.next();
            System.out.println("***************************");
            System.out.println(umlivro.getTitulo());
            System.out.println(umlivro.getAutor());
            System.out.println(umlivro.getEditora());
            System.out.println(umlivro.getAnoEdicao());
            System.out.println(umlivro.getLocalizacao());
        }
        db.close();

    }
    
}
