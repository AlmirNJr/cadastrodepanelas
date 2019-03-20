/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author AJ
 */
public class Usuario {
    
    Long id;
    String nome;
    String tampa;
    
    public Long getId() {
        return id;
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    }
     public String getTampa() {
        return tampa;
    }
    public void setTampa(String tampa) {
        this.tampa = tampa;   
}
}