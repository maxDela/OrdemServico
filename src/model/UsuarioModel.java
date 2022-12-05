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
public class UsuarioModel {
    private int IdUser;
    private String Usuario;
    private String fone;
    private String login;    
    private String Senha;
    private String perfil;
    
    
//construtor vazio 
    public UsuarioModel() {
    }
//construtor cheio
    public UsuarioModel(int IdUser, String Usuario, String fone, String login, String Senha, String perfil) {
        this.IdUser = IdUser;
        this.Usuario = Usuario;
        this.fone = fone;
        this.login = login;
        this.Senha = Senha;
        this.perfil = perfil;
    }
// metodos get e set
    public int getIdUser() {
        return IdUser;
    }

    public void setIduser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}//final