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
public class CadastroDisciplina {

private String codigo;
private String nome;
private String cargahoraria;

public CadastroDisciplina(){}
public void setCodigo(String _codigo) {codigo=_codigo;}
public void setNome(String _nome) {nome=_nome;}
public void setCargaHoraria(String _cargahoraria) {cargahoraria=_cargahoraria;}


public String getCodigo() {return codigo;}
public String getNome() {return nome;}
public String getCargaHoraria() {return cargahoraria;}

    
}
