/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conexao.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.OrdemServico;
import model.UsuarioCliente;

/**
 *
 * @author Dubeks
 */
public class OrdemServicoDAO {

    private int id;
    private Date data;
    private String tipo;
    private UsuarioCliente cliente;
    private String situacao;
    private String equipamento;
    private String defeito;
    private String servico;
    private String tecnico;
    private String valorTotal;
    
    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
    public void emitirOs(OrdemServico os, UsuarioCliente cliente) {

        try {
            conexao = Conexao.conectar();
            String sql = "insert into tbos(tipo,situacao,equipamento,defeito,servico,tecnico,valor,idcli) values(?,?,?,?,?,?,?,?)";

            pst = conexao.prepareStatement(sql);
            pst.setString(1, os.getTipo());
            pst.setString(2, os.getSituacao());
            pst.setString(3, os.getEquipamento());
            pst.setString(4, os.getDefeito());
            pst.setString(5, os.getServico());
            pst.setString(6, os.getTecnico());
            pst.setFloat(7, Float.parseFloat(os.getValorTotal().toString()));
            pst.setInt(8, cliente.getId());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "OS emitida com sucesso");
// btnOsAdicionar.setEnabled(false);
// btnOsPesquisar.setEnabled(false);
// btnOsImprimir.setEnabled(true);

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    public OrdemServicoDAO() {
    }

    public OrdemServicoDAO(int id, Date data, String tipo, UsuarioCliente cliente, String situacao, String equipamento, String defeito, String servico, String tecnico, Float valotTotal) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.cliente = cliente;
        this.situacao = situacao;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.tecnico = tecnico;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UsuarioCliente getCliente() {
        return cliente;
    }

    public void setCliente(UsuarioCliente cliente) {
        this.cliente = cliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
