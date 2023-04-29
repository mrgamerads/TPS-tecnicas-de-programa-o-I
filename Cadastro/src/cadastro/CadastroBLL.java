/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

/**
 *
 * @author unisanta
 */
public class CadastroBLL {
public static void validaTitulo(char _op, Cadastro _umcadastro)
{
 Erro.setErro(false);
 if (_umcadastro.getCodigo().equals(""))
   {Erro.setErro("O campo CODIGO é de preenchimento obrigatório..."); return;}

 CadastroDAL.conecta();
 if (Erro.getErro()) return;
 switch (_op)
 {
     case 'c':  CadastroDAL.consultarPessoa(_umcadastro); break;
     case 'd':  CadastroDAL.excluirPessoa(_umcadastro); break;    
 }
 CadastroDAL.desconecta();
}

public static void validaDados(char _op, Cadastro _umcadastro)
{
 Erro.setErro(false);
 if (_umcadastro.getCodigo().equals(""))
   {Erro.setErro("O campo CODIGO é de preenchimento obrigatório..."); return;}
 if (_umcadastro.getNome().equals(""))
   {Erro.setErro("O campo NOME é de preenchimento obrigatório..."); return;}
 if (_umcadastro.getSexo().equals(""))
   {Erro.setErro("O campo SEXO é de preenchimento obrigatório..."); return;}
 if (_umcadastro.getIdade().equals(""))
   {Erro.setErro("O campo IDADE é de preenchimento obrigatório..."); return;}
 else
   try
     {
     Integer.parseInt(_umcadastro.getCodigo());
     }
   catch (Exception e)
     {
     Erro.setErro("O campo CODIGO deve ser numerico!"); return;
     }
 
 CadastroDAL.conecta();
 if (Erro.getErro()) return;
 switch (_op)
 {
     case 'i':   CadastroDAL.inserirPessoa(_umcadastro); break;
     case 'a':   CadastroDAL.alterarPessoa(_umcadastro); break;    
 }
 CadastroDAL.desconecta();
 
}    
}
