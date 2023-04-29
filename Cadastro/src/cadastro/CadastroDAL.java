/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


/**
 *
 * @author unisanta
 */
public class CadastroDAL {
private static ObjectContainer db;   

public static void conecta(){
try {
    db = Db4o.openFile("meubanco.dbo");
  }
catch (Exception e) {
  Erro.setErro(e.getMessage());
  }    
}

public static void desconecta(){
try {
  db.close();
  }
catch (Exception e) {
  Erro.setErro(e.getMessage());
  }    
}

public static void inserirPessoa(Cadastro _umcadastro){
  Erro.setErro(false);
  try {
      db.set(_umcadastro);
  }
  catch(Exception e){
    Erro.setErro(e.getMessage());
  }     
}

public static void consultarPessoa(Cadastro _umcadastro){
  ObjectSet<Cadastro> lista;
    
  Erro.setErro(false);
  try {
    lista = db.get(_umcadastro);
    if (lista.hasNext())
    {
        Cadastro aux = lista.next();
        _umcadastro.setNome(aux.getNome());
        _umcadastro.setSexo(aux.getSexo());
        _umcadastro.setIdade(aux.getIdade());
    }
    else
    {
        Erro.setErro("Pessoa nao localizada."); return;
    }
  }
  catch(Exception e){
    Erro.setErro(e.getMessage());
  }     
}

public static void alterarPessoa(Cadastro _umcadastro){
  ObjectSet<Cadastro> lista;
  Cadastro consulta = new Cadastro();
  consulta.setCodigo(_umcadastro.getCodigo());
    
  Erro.setErro(false);
  try {
    lista = db.get(consulta);
    if (lista.hasNext())
    {
        consulta = lista.next();
        consulta.setNome(_umcadastro.getNome());
        consulta.setSexo(_umcadastro.getSexo());
        consulta.setIdade(_umcadastro.getIdade());
        db.set(consulta);
    }
    else
    {
        Erro.setErro("Pessoa nao localizada."); return;
    }
  }
  catch(Exception e){
    Erro.setErro(e.getMessage());
  }     
}

public static void excluirPessoa(Cadastro _umcadastro){
  ObjectSet<Cadastro> lista;
    
  Erro.setErro(false);
  try {
    lista = db.get(_umcadastro);
    if (lista.hasNext())
    {
        _umcadastro = lista.next();
        db.delete(_umcadastro);
    }
    else
    {
        Erro.setErro("Pessoa nao localizada."); return;
    }
  }
  catch(Exception e){
    Erro.setErro(e.getMessage());
  }     
}
}
