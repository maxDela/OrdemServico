/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author teclab
 */
public class UsuarioCliente {
    private int Id;
    private String Nome;
    private String Endereco;
    private String Fone;
    private String Email;

    public UsuarioCliente() {
    }

    public UsuarioCliente(int Id, String Nome, String Endereco, String Fone, String Email) {
        this.Id = Id;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Fone = Fone;
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }
    
    
    
}
