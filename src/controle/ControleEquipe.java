/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloEquipe;
        

public class ControleEquipe {
    
    ConexaoBD conex = new ConexaoBD();
    ModeloEquipe mod = new ModeloEquipe();
    
    public void Salvar(ModeloEquipe mod) throws SQLException{
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into equipe(nome_func,cpf_func,cargo_func) values(?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2, mod.getCpf());
            pst.setString(3, mod.getCargo());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados/nErro:"+ex);
           
        }
        
        conex.desconecta();
    }
}
