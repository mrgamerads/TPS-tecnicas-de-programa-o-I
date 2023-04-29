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
public class Cadastro {
private String codigo;
private String nome; 
private String sexo;
private String idade;

public Cadastro (){}
public void setCodigo (String _codigo) {codigo=_codigo;}
public void setNome (String _nome) {nome=_nome;}
public void setSexo (String _sexo) {sexo=_sexo;}
public void setIdade (String _idade) {idade=_idade;}

public String getCodigo() {return codigo;}
public String getNome() {return nome;}
public String getSexo() {return sexo;}
public String getIdade() {return idade;}
}
