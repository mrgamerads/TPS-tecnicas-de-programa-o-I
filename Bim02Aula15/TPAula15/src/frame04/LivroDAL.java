/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame04;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.DriverManager;

/**
 *
 * @author unisanta
 */
public class LivroDAL {

    private static ObjectContainer db;
        
    

   

    public static void inseriLivro(Livro umlivro)
    {
        db = Db4o.openFile("meubanco.dbo");
        db.set(umlivro);
        db.close();        
    }

    public static void consultaLivro(Livro umlivro)
    {
        ObjectSet<Livro> lista;
        Livro aux;
        
        
        db = Db4o.openFile("meubanco.dbo");
        
        umlivro.setTitulo(umlivro.getTitulo());
        umlivro.setAutor(null);
        umlivro.setEditora(null);
        umlivro.setAnoEdicao(null);
        umlivro.setLocalizacao(null);
        
        lista = db.get(umlivro); 
        while (lista.hasNext()){
            aux = lista.next();
            umlivro.setAutor(aux.getAutor());
            umlivro.setEditora(aux.getEditora());
            umlivro.setLocalizacao(aux.getLocalizacao());
            umlivro.setAnoEdicao(aux.getAnoEdicao());
            
        }
        db.close();    
    }
}
