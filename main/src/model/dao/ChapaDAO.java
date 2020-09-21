package model.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Chapa;

/**
 *
 * @author santi
 */
public class ChapaDAO {
    

    
    public void create(Chapa c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO candidato(numero,nome,funcao)VALUES(?,?,?)");
            stmt.setInt(1,c.getNumero());
            stmt.setString(2,c.getNome());
            stmt.setString(3,c.getFuncao());

            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
    
    public List<Chapa> read() {

        Connection con = ConnectionFactory.getConnection();    
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Chapa> chapas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM candidato");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Chapa c = new Chapa();

                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setFuncao(rs.getString("funcao"));
                c.setQuantVotos(rs.getInt("quantVotos"));
                chapas.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChapaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return chapas;

    }
      
    
    public List<Chapa> readTela() {

        Connection con = ConnectionFactory.getConnection();    
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Chapa> chapas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM candidato");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Chapa c = new Chapa();

                c.setNumero(rs.getInt("numero"));
                c.setNome(rs.getString("nome"));
                c.setFuncao(rs.getString("funcao"));
                chapas.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChapaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return chapas;

    }
      
    
    public void update(Chapa c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE candidato SET nome = ? ,funcao = ? WHERE numero = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getFuncao());
            stmt.setInt(3, c.getNumero());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    
    public void Voto(Chapa c) {
        int votos = 0;
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM candidato");
            rs = stmt.executeQuery();

            while (rs.next()) {
                if (c.getNumero()==rs.getInt("numero")){
                    votos=rs.getInt("quantVotos");
                    stmt = con.prepareStatement("UPDATE candidato SET quantVotos = ? WHERE numero = ?");
                    stmt.setInt(2, c.getNumero());
                    stmt.setInt(1, votos+1);
                    stmt.executeUpdate();
                     JOptionPane.showMessageDialog(null, "Votação Concluída!");
                }
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao votar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    
    public void delete(Chapa c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM candidato WHERE numero=?");
            stmt.setInt(1, c.getNumero());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
    


       
        

    


