/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodisciplina;

import java.sql.*;

/**
 *
 * @author unisanta
 */
public class DisciplinaDAL {
    
    private static Connection con;

    public static void conecta(String _bd)
    {
        Erro.setErro(false);
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + _bd);
        }
        catch (Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }

    public static void desconecta()
    {
        Erro.setErro(false);
        try 
        {
            con.close();
        }
        catch (Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }

    public static void inseriDisciplina(CadastroDisciplina cddisc)
    {
        Erro.setErro(false);
        try 
        {
            PreparedStatement st = con.prepareStatement("insert into TabDisciplinas (Código,Nome,CargaHoraria) values (?,?,?)");
            st.setString(1,cddisc.getCodigo());
            st.setString(2,cddisc.getNome());
            st.setString(3,cddisc.getCargaHoraria());

            st.executeUpdate();
            st.close();
        }
        catch(Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }

    public static void consultaDisciplina(CadastroDisciplina cddisc)
    {
        ResultSet rs;

        try
        {
            PreparedStatement st = con.prepareStatement("SELECT * FROM TabDisciplinas WHERE Código=?");
            st.setString(1,cddisc.getCodigo());
            rs = st.executeQuery();
            if (rs.next())
            {
                cddisc.setNome(rs.getString("Nome"));
                cddisc.setCargaHoraria(rs.getString("CargaHoraria"));

            }
            else
            {
                Erro.setErro("Disciplina nao localizada.");
                return;
            }
            st.close();
        }
        catch(Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }    
}
