
package model.dao;

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
import model.bean.Eleitor;


public class EleitorDAO {
    
    int matriculaVoto;
    
    public void setMatriculaVoto(int matricula){
        this.matriculaVoto=matricula;
    }
    
    public int getMatriculaVoto(){
        return this.matriculaVoto;
    }
    
    public void create(Eleitor c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO eleitor(matricula,nome,curso,serie,confVoto)VALUES(?,?,?,?,?)");
            stmt.setInt(1,c.getMatricula());
            stmt.setString(2,c.getNome());
            stmt.setString(3,c.getCurso());
            stmt.setString(4,c.getSerie());
            stmt.setBoolean(5,false);
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    public List<Eleitor> read() {

        Connection con = ConnectionFactory.getConnection();    
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Eleitor> eleitores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM eleitor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Eleitor c = new Eleitor();

                c.setMatricula(rs.getInt("matricula"));
                c.setNome(rs.getString("nome"));
                c.setCurso(rs.getString("curso"));
                c.setSerie(rs.getString("serie"));
                c.setConfVoto(rs.getInt("confVoto"));
                eleitores.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EleitorDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return eleitores;

    }
    
    
    public void update(Eleitor c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE eleitor SET nome = ? ,curso = ?,serie = ? WHERE matricula = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCurso());
            stmt.setString(3, c.getSerie());
            stmt.setInt(4, c.getMatricula());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    
    public void updateConfVoto(Eleitor c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE eleitor SET confVoto = ? WHERE matricula = ?");
            stmt.setInt(1, 1);
            stmt.setInt(2, c.getMatricula());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
      
    
    public void delete(Eleitor c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM eleitor WHERE matricula=?");
            stmt.setInt(1, c.getMatricula());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    
}
