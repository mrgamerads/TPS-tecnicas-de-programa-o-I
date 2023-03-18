/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author unisanta
 */
public class Livro {
    
    private static String _codigo;
    private static String _titulo;
    private static String _autor;
    private static String _editora;
    private static String _ano;
    
    public static String getcodigo(){return _codigo;}
    
    public static String gettitulo(){return _titulo;}
    
    public static String getautor(){return _autor;}
    
    public static String geteditora(){return _editora;}
    
    public static String getano(){return _ano;}
    
    public static void setcodigo(String codigo){_codigo = codigo;}
    
    public static void settitulo(String titulo){_titulo = titulo;}
    
    public static void setautor(String autor){_autor = autor;}
    
    public static void seteditora(String editora){_editora = editora;}
    
    public static void setano(String ano){_ano = ano;}
}
