/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodisciplina;

/**
 *
 * @author unisanta
 */
public class DisciplinaBLL {
    
public static void validaDados(CadastroDisciplina cddisc)
{
 Erro.setErro(false);
 if (cddisc.getCodigo().equals(""))
   {Erro.setErro("O campo CODIGO é de preenchimento obrigatório..."); return;}
 if (cddisc.getNome().equals(""))
   {Erro.setErro("O campo NOME é de preenchimento obrigatório..."); return;}
 if (cddisc.getCargaHoraria().equals(""))
   {Erro.setErro("O campo CARGA HORARIA é de preenchimento obrigatório..."); return;}
 
 else


 DisciplinaDAL.conecta("Livros.mdb");
 if (Erro.getErro()) return;
 DisciplinaDAL.inseriDisciplina(cddisc);
 if (Erro.getErro()) return;
 DisciplinaDAL.desconecta();
}    

  
}
